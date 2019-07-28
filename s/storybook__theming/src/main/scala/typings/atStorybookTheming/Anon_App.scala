package typings.atStorybookTheming

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_App extends js.Object {
  var app: String
  var bar: String
  var content: String
  var critical: String
  var gridCellSize: Double
  var hoverable: String
  var negative: String
  var positive: String
  var warning: String
}

object Anon_App {
  @scala.inline
  def apply(
    app: String,
    bar: String,
    content: String,
    critical: String,
    gridCellSize: Double,
    hoverable: String,
    negative: String,
    positive: String,
    warning: String
  ): Anon_App = {
    val __obj = js.Dynamic.literal(app = app, bar = bar, content = content, critical = critical, gridCellSize = gridCellSize, hoverable = hoverable, negative = negative, positive = positive, warning = warning)
  
    __obj.asInstanceOf[Anon_App]
  }
}

