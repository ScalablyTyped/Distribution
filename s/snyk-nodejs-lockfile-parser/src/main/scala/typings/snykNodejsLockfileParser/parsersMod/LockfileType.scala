package typings.snykNodejsLockfileParser.parsersMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LockfileType extends js.Object

@JSImport("snyk-nodejs-lockfile-parser/dist/parsers", "LockfileType")
@js.native
object LockfileType extends js.Object {
  @js.native
  sealed trait npm extends LockfileType
  
  @js.native
  sealed trait yarn extends LockfileType
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[LockfileType with String] = js.native
  /* "npm" */ @js.native
  object npm extends TopLevel[npm with String]
  
  /* "yarn" */ @js.native
  object yarn extends TopLevel[yarn with String]
  
}

