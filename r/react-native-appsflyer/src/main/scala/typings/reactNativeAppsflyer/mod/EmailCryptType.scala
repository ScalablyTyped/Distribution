package typings.reactNativeAppsflyer.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EmailCryptType extends js.Object
@JSImport("react-native-appsflyer", "EmailCryptType")
@js.native
object EmailCryptType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EmailCryptType with Double] = js.native
  
  @js.native
  sealed trait EmailCryptTypeMD5 extends EmailCryptType
  /* 2 */ @js.native
  object EmailCryptTypeMD5 extends TopLevel[EmailCryptTypeMD5 with Double]
  
  @js.native
  sealed trait EmailCryptTypeNone extends EmailCryptType
  /* 0 */ @js.native
  object EmailCryptTypeNone extends TopLevel[EmailCryptTypeNone with Double]
  
  @js.native
  sealed trait EmailCryptTypeSHA1 extends EmailCryptType
  /* 1 */ @js.native
  object EmailCryptTypeSHA1 extends TopLevel[EmailCryptTypeSHA1 with Double]
  
  @js.native
  sealed trait EmailCryptTypeSHA256 extends EmailCryptType
  /* 3 */ @js.native
  object EmailCryptTypeSHA256 extends TopLevel[EmailCryptTypeSHA256 with Double]
}
