package typings.rcDashProgress

import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PathString extends js.Object {
  var pathString: String
  var strokePathStyle: js.Array[CSSProperties] | CSSProperties
  var trailPathStyle: js.Array[CSSProperties] | CSSProperties
}

object Anon_PathString {
  @scala.inline
  def apply(
    pathString: String,
    strokePathStyle: js.Array[CSSProperties] | CSSProperties,
    trailPathStyle: js.Array[CSSProperties] | CSSProperties
  ): Anon_PathString = {
    val __obj = js.Dynamic.literal(pathString = pathString, strokePathStyle = strokePathStyle.asInstanceOf[js.Any], trailPathStyle = trailPathStyle.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_PathString]
  }
}

