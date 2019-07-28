package typings.psl.pslMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("psl", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def get(): Null = js.native
  def get(domain: String): String | Null = js.native
  def isValid(domain: String): Boolean = js.native
  def parse(domain: String): ParsedDomain | ParseError = js.native
}

