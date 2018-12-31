package typings
package sqsDashProducerLib.sqsDashProducerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProducerMessage extends js.Object {
  var body: java.lang.String
  var delaySeconds: js.UndefOr[scala.Double] = js.undefined
  var id: java.lang.String
  var messageAttributes: js.UndefOr[org.scalablytyped.runtime.StringDictionary[ProducerMessageAttribute]] = js.undefined
}

