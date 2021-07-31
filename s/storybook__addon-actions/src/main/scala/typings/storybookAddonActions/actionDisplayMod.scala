package typings.storybookAddonActions

import typings.storybookAddonActions.actionOptionsMod.ActionOptions
import typings.storybookAddonActions.anon.Args
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionDisplayMod {
  
  trait ActionDisplay extends StObject {
    
    var count: Double
    
    var data: Args
    
    var id: String
    
    var options: ActionOptions
  }
  object ActionDisplay {
    
    @scala.inline
    def apply(count: Double, data: Args, id: String, options: ActionOptions): ActionDisplay = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActionDisplay]
    }
    
    @scala.inline
    implicit class ActionDisplayMutableBuilder[Self <: ActionDisplay] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: Args): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: ActionOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
}
