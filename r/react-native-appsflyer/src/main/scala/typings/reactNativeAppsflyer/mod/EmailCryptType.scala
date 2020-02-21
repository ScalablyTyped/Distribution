package typings.reactNativeAppsflyer.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EmailCryptType extends js.Object

@JSImport("react-native-appsflyer", "EmailCryptType")
@js.native
object EmailCryptType extends js.Object {
  @js.native
  sealed trait EmailCryptTypeMD5 extends EmailCryptType
  
  @js.native
  sealed trait EmailCryptTypeNone extends EmailCryptType
  
  @js.native
  sealed trait EmailCryptTypeSHA1 extends EmailCryptType
  
  @js.native
  sealed trait EmailCryptTypeSHA256 extends EmailCryptType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmailCryptType with Double] = js.native
  /* 2 */ @js.native
  object EmailCryptTypeMD5 extends TopLevel[EmailCryptTypeMD5 with Double]
  
  /* 0 */ @js.native
  object EmailCryptTypeNone extends TopLevel[EmailCryptTypeNone with Double]
  
  /* 1 */ @js.native
  object EmailCryptTypeSHA1 extends TopLevel[EmailCryptTypeSHA1 with Double]
  
  /* 3 */ @js.native
  object EmailCryptTypeSHA256 extends TopLevel[EmailCryptTypeSHA256 with Double]
  
}

