package typings.reactMdAppBar

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactMdAppBar.typesAppBarActionMod.AppBarActionProps
import typings.reactMdAppBar.typesAppBarMod.AppBarProps
import typings.reactMdAppBar.typesAppBarNavMod.AppBarNavProps
import typings.reactMdAppBar.typesAppBarTitleMod.AppBarTitleProps
import typings.reactMdAppBar.typesUseActionClassNameMod.AppBarActionClassNameProps
import typings.std.HTMLButtonElement
import typings.std.HTMLDivElement
import typings.std.HTMLHeadingElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/app-bar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/app-bar", "APP_BAR_OFFSET_CLASSNAME")
  @js.native
  val APP_BAR_OFFSET_CLASSNAME: /* "rmd-app-bar-offset" */ String = js.native
  
  @JSImport("@react-md/app-bar", "APP_BAR_OFFSET_DENSE_CLASSNAME")
  @js.native
  val APP_BAR_OFFSET_DENSE_CLASSNAME: /* "rmd-app-bar-offset--dense" */ String = js.native
  
  @JSImport("@react-md/app-bar", "APP_BAR_OFFSET_PROMINENT_CLASSNAME")
  @js.native
  val APP_BAR_OFFSET_PROMINENT_CLASSNAME: /* "rmd-app-bar-offset--prominent" */ String = js.native
  
  @JSImport("@react-md/app-bar", "APP_BAR_OFFSET_PROMINENT_DENSE_CLASSNAME")
  @js.native
  val APP_BAR_OFFSET_PROMINENT_DENSE_CLASSNAME: /* "rmd-app-bar-offset--prominent-dense" */ String = js.native
  
  @JSImport("@react-md/app-bar", "AppBar")
  @js.native
  val AppBar: ForwardRefExoticComponent[AppBarProps & RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/app-bar", "AppBarAction")
  @js.native
  val AppBarAction: ForwardRefExoticComponent[AppBarActionProps & RefAttributes[HTMLButtonElement]] = js.native
  
  @JSImport("@react-md/app-bar", "AppBarNav")
  @js.native
  val AppBarNav: ForwardRefExoticComponent[AppBarNavProps & RefAttributes[HTMLButtonElement]] = js.native
  
  @JSImport("@react-md/app-bar", "AppBarTitle")
  @js.native
  val AppBarTitle: ForwardRefExoticComponent[AppBarTitleProps & RefAttributes[HTMLHeadingElement]] = js.native
  
  inline def useActionClassName(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("useActionClassName")().asInstanceOf[String]
  inline def useActionClassName(hasFirstLastInheritColorClassName: AppBarActionClassNameProps): String = ^.asInstanceOf[js.Dynamic].applyDynamic("useActionClassName")(hasFirstLastInheritColorClassName.asInstanceOf[js.Any]).asInstanceOf[String]
}
