package typings.semanticUiReact.headerHeaderMod

import typings.react.mod.FunctionComponent
import typings.react.mod.StatelessComponent
import typings.semanticUiReact.headerContentMod.HeaderContentProps
import typings.semanticUiReact.headerSubheaderMod.HeaderSubheaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeaderComponent extends FunctionComponent[HeaderProps] {
  
  var Content: StatelessComponent[HeaderContentProps] = js.native
  
  var Subheader: StatelessComponent[HeaderSubheaderProps] = js.native
}
