package typings.storybookReact

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("@storybook/react/dist/ts3.9/client/docs/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@storybook/react/dist/ts3.9/client/docs/lib", "ARRAY_CAPTION")
  @js.native
  val ARRAY_CAPTION: /* "array" */ String = js.native
  
  @JSImport("@storybook/react/dist/ts3.9/client/docs/lib", "CLASS_CAPTION")
  @js.native
  val CLASS_CAPTION: /* "class" */ String = js.native
  
  @JSImport("@storybook/react/dist/ts3.9/client/docs/lib", "CUSTOM_CAPTION")
  @js.native
  val CUSTOM_CAPTION: /* "custom" */ String = js.native
  
  @JSImport("@storybook/react/dist/ts3.9/client/docs/lib", "ELEMENT_CAPTION")
  @js.native
  val ELEMENT_CAPTION: /* "element" */ String = js.native
  
  @JSImport("@storybook/react/dist/ts3.9/client/docs/lib", "FUNCTION_CAPTION")
  @js.native
  val FUNCTION_CAPTION: /* "func" */ String = js.native
  
  @JSImport("@storybook/react/dist/ts3.9/client/docs/lib", "OBJECT_CAPTION")
  @js.native
  val OBJECT_CAPTION: /* "object" */ String = js.native
  
  inline def generateArrayCode(ast: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateArrayCode")(ast.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def generateArrayCode(ast: Any, compact: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateArrayCode")(ast.asInstanceOf[js.Any], compact.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def generateCode(ast: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateCode")(ast.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def generateCode(ast: Any, compact: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateCode")(ast.asInstanceOf[js.Any], compact.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def generateObjectCode(ast: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateObjectCode")(ast.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def generateObjectCode(ast: Any, compact: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateObjectCode")(ast.asInstanceOf[js.Any], compact.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def isForwardRef(component: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isForwardRef")(component.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isHtmlTag(tagName: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHtmlTag")(tagName.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isMemo(component: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMemo")(component.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
