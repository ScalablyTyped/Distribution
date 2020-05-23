package typings.snykPaketParser.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DepType extends js.Object

@JSImport("snyk-paket-parser", "DepType")
@js.native
object DepType extends js.Object {
  @js.native
  sealed trait dev extends DepType
  
  @js.native
  sealed trait prod extends DepType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DepType with String] = js.native
  /* "dev" */ @js.native
  object dev extends TopLevel[dev with String]
  
  /* "prod" */ @js.native
  object prod extends TopLevel[prod with String]
  
}

