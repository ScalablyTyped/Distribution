package typings.reactClock

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsSharedPropTypesMod {
  
  @JSImport("react-clock/dist/cjs/shared/propTypes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isHandLength(props: Record[String, Any], propName: String, componentName: String): js.Error | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("isHandLength")(props.asInstanceOf[js.Any], propName.asInstanceOf[js.Any], componentName.asInstanceOf[js.Any])).asInstanceOf[js.Error | Null]
  
  inline def isHandWidth(props: Record[String, Any], propName: String, componentName: String): js.Error | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("isHandWidth")(props.asInstanceOf[js.Any], propName.asInstanceOf[js.Any], componentName.asInstanceOf[js.Any])).asInstanceOf[js.Error | Null]
  
  inline def isMarkLength(props: Record[String, Any], propName: String, componentName: String): js.Error | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("isMarkLength")(props.asInstanceOf[js.Any], propName.asInstanceOf[js.Any], componentName.asInstanceOf[js.Any])).asInstanceOf[js.Error | Null]
  
  @JSImport("react-clock/dist/cjs/shared/propTypes", "isMarkWidth")
  @js.native
  val isMarkWidth: js.Function3[
    /* props */ Record[String, Any], 
    /* propName */ String, 
    /* componentName */ String, 
    js.Error | Null
  ] = js.native
  
  inline def isOppositeHandLength(props: Record[String, Any], propName: String, componentName: String): js.Error | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("isOppositeHandLength")(props.asInstanceOf[js.Any], propName.asInstanceOf[js.Any], componentName.asInstanceOf[js.Any])).asInstanceOf[js.Error | Null]
}
