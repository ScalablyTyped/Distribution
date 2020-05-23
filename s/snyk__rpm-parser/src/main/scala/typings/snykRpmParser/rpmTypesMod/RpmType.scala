package typings.snykRpmParser.rpmTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RpmType extends js.Object

@JSImport("@snyk/rpm-parser/dist/rpm/types", "RpmType")
@js.native
object RpmType extends js.Object {
  @js.native
  sealed trait BIN extends RpmType
  
  @js.native
  sealed trait CHAR extends RpmType
  
  @js.native
  sealed trait I18NSTRING extends RpmType
  
  @js.native
  sealed trait INT16 extends RpmType
  
  @js.native
  sealed trait INT32 extends RpmType
  
  @js.native
  sealed trait INT64 extends RpmType
  
  @js.native
  sealed trait INT8 extends RpmType
  
  @js.native
  sealed trait NULL extends RpmType
  
  @js.native
  sealed trait STRING extends RpmType
  
  @js.native
  sealed trait STRING_ARRAY extends RpmType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RpmType with Double] = js.native
  /* 7 */ @js.native
  object BIN extends TopLevel[BIN with Double]
  
  /* 1 */ @js.native
  object CHAR extends TopLevel[CHAR with Double]
  
  /* 9 */ @js.native
  object I18NSTRING extends TopLevel[I18NSTRING with Double]
  
  /* 3 */ @js.native
  object INT16 extends TopLevel[INT16 with Double]
  
  /* 4 */ @js.native
  object INT32 extends TopLevel[INT32 with Double]
  
  /* 5 */ @js.native
  object INT64 extends TopLevel[INT64 with Double]
  
  /* 2 */ @js.native
  object INT8 extends TopLevel[INT8 with Double]
  
  /* 0 */ @js.native
  object NULL extends TopLevel[NULL with Double]
  
  /* 6 */ @js.native
  object STRING extends TopLevel[STRING with Double]
  
  /* 8 */ @js.native
  object STRING_ARRAY extends TopLevel[STRING_ARRAY with Double]
  
}

