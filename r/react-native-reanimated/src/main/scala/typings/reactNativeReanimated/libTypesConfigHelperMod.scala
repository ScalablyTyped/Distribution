package typings.reactNativeReanimated

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesConfigHelperMod {
  
  @JSImport("react-native-reanimated/lib/types/ConfigHelper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def adaptViewConfig(viewConfig: ViewConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("adaptViewConfig")(viewConfig.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def addWhitelistedNativeProps(props: Record[String, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addWhitelistedNativeProps")(props.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def addWhitelistedUIProps(props: Record[String, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addWhitelistedUIProps")(props.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait ViewConfig extends StObject {
    
    var uiViewClassName: String
    
    var validAttributes: Record[String, Any]
  }
  object ViewConfig {
    
    inline def apply(uiViewClassName: String, validAttributes: Record[String, Any]): ViewConfig = {
      val __obj = js.Dynamic.literal(uiViewClassName = uiViewClassName.asInstanceOf[js.Any], validAttributes = validAttributes.asInstanceOf[js.Any])
      __obj.asInstanceOf[ViewConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ViewConfig] (val x: Self) extends AnyVal {
      
      inline def setUiViewClassName(value: String): Self = StObject.set(x, "uiViewClassName", value.asInstanceOf[js.Any])
      
      inline def setValidAttributes(value: Record[String, Any]): Self = StObject.set(x, "validAttributes", value.asInstanceOf[js.Any])
    }
  }
}
