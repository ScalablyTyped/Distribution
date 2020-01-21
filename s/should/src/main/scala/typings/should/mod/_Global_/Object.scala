package typings.should.mod._Global_

import typings.should.mod.Assertion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Object extends js.Object {
  var should: Assertion
}

object Object {
  @scala.inline
  def apply(should: Assertion): Object = {
    val __obj = js.Dynamic.literal(should = should.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Object]
  }
}

