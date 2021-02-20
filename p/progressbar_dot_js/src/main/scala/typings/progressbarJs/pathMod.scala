package typings.progressbarJs

import typings.progressbarJs.mod.AnimationOptions
import typings.progressbarJs.mod.AnimationSupport
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathMod {
  
  // tslint:disable-next-line no-empty-interface adds members from animation contract
  @JSImport("progressbar.js/path", JSImport.Namespace)
  @js.native
  class ^[SElement /* <: Element */] () extends Path[SElement] {
    def this(path: SElement) = this()
    def this(path: String) = this()
    def this(path: SElement, options: AnimationOptions) = this()
    def this(path: String, options: AnimationOptions) = this()
    def this(path: Null, options: AnimationOptions) = this()
  }
  
  // tslint:disable-next-line no-empty-interface adds members from animation contract
  @js.native
  trait Path[SElement /* <: Element */] extends AnimationSupport {
    
    val path: js.UndefOr[SElement] = js.native
  }
}
