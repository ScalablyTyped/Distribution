package typings
package pslLib.pslMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("psl", JSImport.Namespace)
@js.native
object pslModMembers extends js.Object {
  def get(): scala.Null = js.native
  def get(domain: java.lang.String): java.lang.String | scala.Null = js.native
  def isValid(domain: java.lang.String): scala.Boolean = js.native
  def parse(domain: java.lang.String): ParsedDomain | ParseError = js.native
}

