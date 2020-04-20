package typings.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegExpConstructor
  extends Instantiable1[(/* pattern */ RegExp) | (/* pattern */ java.lang.String), RegExp]
     with Instantiable2[
      (/* pattern */ RegExp) | (/* pattern */ java.lang.String), 
      /* flags */ java.lang.String, 
      RegExp
    ] {
  // Non-standard extensions
  @JSName("$1")
  var $1: java.lang.String = js.native
  @JSName("$2")
  var $2: java.lang.String = js.native
  @JSName("$3")
  var $3: java.lang.String = js.native
  @JSName("$4")
  var $4: java.lang.String = js.native
  @JSName("$5")
  var $5: java.lang.String = js.native
  @JSName("$6")
  var $6: java.lang.String = js.native
  @JSName("$7")
  var $7: java.lang.String = js.native
  @JSName("$8")
  var $8: java.lang.String = js.native
  @JSName("$9")
  var $9: java.lang.String = js.native
  var lastMatch: java.lang.String = js.native
  @JSName(js.Symbol.species)
  val species: RegExpConstructor = js.native
  def apply(pattern: java.lang.String): RegExp = js.native
  def apply(pattern: java.lang.String, flags: java.lang.String): RegExp = js.native
  def apply(pattern: RegExp): RegExp = js.native
  def apply(pattern: RegExp, flags: java.lang.String): RegExp = js.native
}

