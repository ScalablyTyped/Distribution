package typings
package saslmechanismsLib.saslmechanismsMod.FactoryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Mechanism extends js.Object {
  var name: java.lang.String
  def challenge(chal: java.lang.String): scala.Unit
  def response(cred: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String
}

