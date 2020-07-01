package typings.reactMathjax.mod

import typings.react.mod.Component
import typings.reactMathjax.anon.Children
import typings.reactMathjax.anon.Formula
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-mathjax", "MathJax")
@js.native
object MathJax extends js.Object {
  type Node = Component[Formula, js.Object, js.Any]
  type Provider = Component[Children, MathJaxContextValue, js.Any]
}

