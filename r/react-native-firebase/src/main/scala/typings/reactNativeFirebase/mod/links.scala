package typings.reactNativeFirebase.mod

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object links extends Shortcut {
  
  @JSImport("react-native-firebase", "links")
  @js.native
  val ^ : LinksModule = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-native-firebase", "links.DynamicLink")
  @js.native
  class DynamicLink protected ()
    extends typings.reactNativeFirebase.mod.RNFirebase.links.DynamicLink {
    def this(link: String, domainURIPrefix: String) = this()
  }
  
  type _To = LinksModule
  
  /* This means you don't have to write `^`, but can instead just say `links.foo` */
  override def _to: LinksModule = ^
}
