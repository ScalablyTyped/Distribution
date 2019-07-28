package typings.replaceDashString

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object replaceDashStringMod {
  type ReplacementFunction = js.Function4[
    /* needle */ String, 
    /* matchCount */ Double, 
    /* input */ String, 
    /* matchIndex */ Double, 
    String
  ]
}
