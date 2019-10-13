package typings.should.shouldMod._Global_

import typings.should.shouldMod.Assertion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Object extends js.Object {
  var should: Assertion
}

object Object {
  @scala.inline
  def apply(should: Assertion): Object = {
    val __obj = js.Dynamic.literal(should = should)
  
    __obj.asInstanceOf[Object]
  }
}

