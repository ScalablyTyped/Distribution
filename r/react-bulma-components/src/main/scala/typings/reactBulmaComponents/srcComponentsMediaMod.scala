package typings.reactBulmaComponents

import org.scalablytyped.runtime.Shortcut
import typings.reactBulmaComponents.anon.`0`
import typings.reactBulmaComponents.reactBulmaComponentsStrings.article
import typings.reactBulmaComponents.reactBulmaComponentsStrings.center
import typings.reactBulmaComponents.reactBulmaComponentsStrings.left
import typings.reactBulmaComponents.reactBulmaComponentsStrings.right
import typings.reactBulmaComponents.srcComponentsMod.BulmaComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcComponentsMediaMod extends Shortcut {
  
  @JSImport("react-bulma-components/src/components/media", JSImport.Default)
  @js.native
  val default: (BulmaComponent[js.Object, article]) & `0` = js.native
  
  trait MediaItemProps extends StObject {
    
    var align: js.UndefOr[center | right | left] = js.undefined
  }
  object MediaItemProps {
    
    inline def apply(): MediaItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MediaItemProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MediaItemProps] (val x: Self) extends AnyVal {
      
      inline def setAlign(value: center | right | left): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    }
  }
  
  type _To = (BulmaComponent[js.Object, article]) & `0`
  
  /* This means you don't have to write `default`, but can instead just say `srcComponentsMediaMod.foo` */
  override def _to: (BulmaComponent[js.Object, article]) & `0` = default
}
