package typings.reactMathjax.mod

import typings.react.mod.Component
import typings.reactMathjax.anon.Children
import typings.reactMathjax.anon.Formula
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-mathjax", JSImport.Default)
@js.native
object default extends js.Object {
  @js.native
  class Node ()
    extends Component[Formula, js.Object, js.Any]
  
  @js.native
  class Provider ()
    extends Component[Children, MathJaxContextValue, js.Any]
  
}

