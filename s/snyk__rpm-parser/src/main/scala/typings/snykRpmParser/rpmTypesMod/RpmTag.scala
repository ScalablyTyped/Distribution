package typings.snykRpmParser.rpmTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RpmTag extends js.Object

@JSImport("@snyk/rpm-parser/dist/rpm/types", "RpmTag")
@js.native
object RpmTag extends js.Object {
  @js.native
  sealed trait ARCH extends RpmTag
  
  @js.native
  sealed trait EPOCH extends RpmTag
  
  @js.native
  sealed trait NAME extends RpmTag
  
  @js.native
  sealed trait RELEASE extends RpmTag
  
  @js.native
  sealed trait SIZE extends RpmTag
  
  @js.native
  sealed trait VERSION extends RpmTag
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RpmTag with Double] = js.native
  /* 1022 */ @js.native
  object ARCH extends TopLevel[ARCH with Double]
  
  /* 1003 */ @js.native
  object EPOCH extends TopLevel[EPOCH with Double]
  
  /* 1000 */ @js.native
  object NAME extends TopLevel[NAME with Double]
  
  /* 1002 */ @js.native
  object RELEASE extends TopLevel[RELEASE with Double]
  
  /* 1009 */ @js.native
  object SIZE extends TopLevel[SIZE with Double]
  
  /* 1001 */ @js.native
  object VERSION extends TopLevel[VERSION with Double]
  
}

