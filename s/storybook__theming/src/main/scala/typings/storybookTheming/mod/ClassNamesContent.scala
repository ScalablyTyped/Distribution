package typings.storybookTheming.mod

import typings.std.TemplateStringsArray
import typings.storybookTheming.distCreateC2b2ce6dMod.CSSInterpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassNamesContent extends StObject {
  
  def css(args: CSSInterpolation*): String = js.native
  def css(template: TemplateStringsArray, args: CSSInterpolation*): String = js.native
  
  def cx(args: ClassNamesArg*): String = js.native
  
  var theme: Theme = js.native
}
