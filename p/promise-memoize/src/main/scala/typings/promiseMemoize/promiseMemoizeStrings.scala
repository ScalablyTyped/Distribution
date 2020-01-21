package typings.promiseMemoize

import typings.promiseMemoize.mod._KeyResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object promiseMemoizeStrings {
  @js.native
  sealed trait json extends _KeyResolver
  
  @js.native
  sealed trait simple extends _KeyResolver
  
  @scala.inline
  def json: json = "json".asInstanceOf[json]
  @scala.inline
  def simple: simple = "simple".asInstanceOf[simple]
}

