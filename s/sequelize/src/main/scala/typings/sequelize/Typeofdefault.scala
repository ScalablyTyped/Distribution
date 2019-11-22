package typings.sequelize

import typings.sequelize.sequelizeNumbers.`3`
import typings.sequelize.sequelizeNumbers.`5`
import typings.sequelize.sequelizeNumbers.`false`
import typings.sequelize.sequelizeStrings.`10`
import typings.sequelize.sequelizeStrings.`13`
import typings.sequelize.sequelizeStrings.`4`
import typings.sequelize.sequelizeStrings.`6`
import typings.sequelize.sequelizeStrings.all
import typings.sequelize.sequelizeStrings.any
import typings.std.Date
import typings.std.RegExp
import typings.validator.validatorMod.AlphaLocale
import typings.validator.validatorMod.AlphanumericLocale
import typings.validator.validatorMod.FloatLocale
import typings.validator.validatorMod.HashAlgorithm
import typings.validator.validatorMod.IdentityCardLocale
import typings.validator.validatorMod.IsByteLengthOptions
import typings.validator.validatorMod.IsCurrencyOptions
import typings.validator.validatorMod.IsDecimalOptions
import typings.validator.validatorMod.IsEmailOptions
import typings.validator.validatorMod.IsEmptyOptions
import typings.validator.validatorMod.IsFQDNOptions
import typings.validator.validatorMod.IsFloatOptions
import typings.validator.validatorMod.IsISO8601Options
import typings.validator.validatorMod.IsISSNOptions
import typings.validator.validatorMod.IsIntOptions
import typings.validator.validatorMod.IsLengthOptions
import typings.validator.validatorMod.IsMACAddressOptions
import typings.validator.validatorMod.IsMobilePhoneOptions
import typings.validator.validatorMod.IsNumericOptions
import typings.validator.validatorMod.IsURLOptions
import typings.validator.validatorMod.MobilePhoneLocale
import typings.validator.validatorMod.NormalizeEmailOptions
import typings.validator.validatorMod.PostalCodeLocale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofdefault extends js.Object {
  val isAlphaLocales: js.Array[AlphaLocale] = js.native
  val isAlphanumericLocales: js.Array[AlphanumericLocale] = js.native
  val isFloatLocales: js.Array[FloatLocale] = js.native
  val isMobilePhoneLocales: js.Array[MobilePhoneLocale] = js.native
  val isPostalCodeLocales: js.Array[PostalCodeLocale] = js.native
  val version: String = js.native
  def blacklist(input: String, chars: String): String = js.native
  def contains(str: String, seed: js.Any): Boolean = js.native
  def equals(str: String, comparison: String): Boolean = js.native
  def escape(input: String): String = js.native
  def isAfter(str: String): Boolean = js.native
  def isAfter(str: String, date: String): Boolean = js.native
  def isAlpha(str: String): Boolean = js.native
  def isAlpha(str: String, locale: AlphaLocale): Boolean = js.native
  def isAlphanumeric(str: String): Boolean = js.native
  def isAlphanumeric(str: String, locale: AlphanumericLocale): Boolean = js.native
  def isAscii(str: String): Boolean = js.native
  def isBIC(str: String): Boolean = js.native
  def isBase32(str: String): Boolean = js.native
  def isBase64(str: String): Boolean = js.native
  def isBefore(str: String): Boolean = js.native
  def isBefore(str: String, date: String): Boolean = js.native
  def isBoolean(str: String): Boolean = js.native
  def isByteLength(str: String): Boolean = js.native
  def isByteLength(str: String, options: IsByteLengthOptions): Boolean = js.native
  def isCreditCard(str: String): Boolean = js.native
  def isCurrency(str: String): Boolean = js.native
  def isCurrency(str: String, options: IsCurrencyOptions): Boolean = js.native
  def isDataURI(str: String): Boolean = js.native
  def isDecimal(str: String): Boolean = js.native
  def isDecimal(str: String, options: IsDecimalOptions): Boolean = js.native
  def isDivisibleBy(str: String, number: Double): Boolean = js.native
  def isEmail(str: String): Boolean = js.native
  def isEmail(str: String, options: IsEmailOptions): Boolean = js.native
  def isEmpty(str: String): Boolean = js.native
  def isEmpty(str: String, options: IsEmptyOptions): Boolean = js.native
  def isFQDN(str: String): Boolean = js.native
  def isFQDN(str: String, options: IsFQDNOptions): Boolean = js.native
  def isFloat(str: String): Boolean = js.native
  def isFloat(str: String, options: IsFloatOptions): Boolean = js.native
  def isFullWidth(str: String): Boolean = js.native
  def isHalfWidth(str: String): Boolean = js.native
  def isHash(str: String, algorithm: HashAlgorithm): Boolean = js.native
  def isHexColor(str: String): Boolean = js.native
  def isHexadecimal(str: String): Boolean = js.native
  def isIP(str: String): Boolean = js.native
  def isIPRange(str: String): Boolean = js.native
  @JSName("isIP")
  def isIP_4(str: String, version: `4`): Boolean = js.native
  @JSName("isIP")
  def isIP_6(str: String, version: `6`): Boolean = js.native
  def isISBN(str: String): Boolean = js.native
  @JSName("isISBN")
  def isISBN_10(str: String, version: `10`): Boolean = js.native
  @JSName("isISBN")
  def isISBN_13(str: String, version: `13`): Boolean = js.native
  def isISIN(str: String): Boolean = js.native
  def isISO31661Alpha2(str: String): Boolean = js.native
  def isISO31661Alpha3(str: String): Boolean = js.native
  def isISO8601(str: String): Boolean = js.native
  def isISO8601(str: String, options: IsISO8601Options): Boolean = js.native
  def isISRC(str: String): Boolean = js.native
  def isISSN(str: String): Boolean = js.native
  def isISSN(str: String, options: IsISSNOptions): Boolean = js.native
  def isIdentityCard(str: String): Boolean = js.native
  def isIdentityCard(str: String, locale: IdentityCardLocale): Boolean = js.native
  @JSName("isIdentityCard")
  def isIdentityCard_any(str: String, locale: any): Boolean = js.native
  def isIn(str: String, values: js.Array[_]): Boolean = js.native
  def isInt(str: String): Boolean = js.native
  def isInt(str: String, options: IsIntOptions): Boolean = js.native
  def isJSON(str: String): Boolean = js.native
  def isJWT(str: String): Boolean = js.native
  def isLatLong(str: String): Boolean = js.native
  def isLength(str: String): Boolean = js.native
  def isLength(str: String, options: IsLengthOptions): Boolean = js.native
  def isLowercase(str: String): Boolean = js.native
  def isMACAddress(str: String): Boolean = js.native
  def isMACAddress(str: String, options: IsMACAddressOptions): Boolean = js.native
  def isMD5(str: String): Boolean = js.native
  def isMagnetURI(str: String): Boolean = js.native
  def isMimeType(str: String): Boolean = js.native
  def isMobilePhone(str: String): Boolean = js.native
  def isMobilePhone(str: String, locale: js.Array[MobilePhoneLocale]): Boolean = js.native
  def isMobilePhone(str: String, locale: js.Array[MobilePhoneLocale], options: IsMobilePhoneOptions): Boolean = js.native
  def isMobilePhone(str: String, locale: MobilePhoneLocale): Boolean = js.native
  def isMobilePhone(str: String, locale: MobilePhoneLocale, options: IsMobilePhoneOptions): Boolean = js.native
  @JSName("isMobilePhone")
  def isMobilePhone_any(str: String, locale: any): Boolean = js.native
  @JSName("isMobilePhone")
  def isMobilePhone_any(str: String, locale: any, options: IsMobilePhoneOptions): Boolean = js.native
  def isMongoId(str: String): Boolean = js.native
  def isMultibyte(str: String): Boolean = js.native
  def isNumeric(str: String): Boolean = js.native
  def isNumeric(str: String, options: IsNumericOptions): Boolean = js.native
  def isOctal(str: String): Boolean = js.native
  def isPort(str: String): Boolean = js.native
  def isPostalCode(str: String, locale: PostalCodeLocale): Boolean = js.native
  @JSName("isPostalCode")
  def isPostalCode_any(str: String, locale: any): Boolean = js.native
  def isRFC3339(str: String): Boolean = js.native
  def isSlug(str: String): Boolean = js.native
  def isSurrogatePair(str: String): Boolean = js.native
  def isURL(str: String): Boolean = js.native
  def isURL(str: String, options: IsURLOptions): Boolean = js.native
  def isUUID(str: String): Boolean = js.native
  @JSName("isUUID")
  def isUUID_3(str: String, version: `3`): Boolean = js.native
  @JSName("isUUID")
  def isUUID_3(str: String, version: typings.sequelize.sequelizeStrings.`3`): Boolean = js.native
  @JSName("isUUID")
  def isUUID_4(str: String, version: typings.sequelize.sequelizeNumbers.`4`): Boolean = js.native
  @JSName("isUUID")
  def isUUID_4(str: String, version: `4`): Boolean = js.native
  @JSName("isUUID")
  def isUUID_5(str: String, version: `5`): Boolean = js.native
  @JSName("isUUID")
  def isUUID_5(str: String, version: typings.sequelize.sequelizeStrings.`5`): Boolean = js.native
  @JSName("isUUID")
  def isUUID_all(str: String, version: all): Boolean = js.native
  def isUppercase(str: String): Boolean = js.native
  def isVariableWidth(str: String): Boolean = js.native
  def isWhitelisted(str: String, chars: String): Boolean = js.native
  def isWhitelisted(str: String, chars: js.Array[String]): Boolean = js.native
  def ltrim(input: String): String = js.native
  def ltrim(input: String, chars: String): String = js.native
  def matches(str: String, pattern: String): Boolean = js.native
  def matches(str: String, pattern: String, modifiers: String): Boolean = js.native
  def matches(str: String, pattern: RegExp): Boolean = js.native
  def normalizeEmail(email: String): String | `false` = js.native
  def normalizeEmail(email: String, options: NormalizeEmailOptions): String | `false` = js.native
  def rtrim(input: String): String = js.native
  def rtrim(input: String, chars: String): String = js.native
  def stripLow(input: String): String = js.native
  def stripLow(input: String, keep_new_lines: Boolean): String = js.native
  def toBoolean(input: String): Boolean = js.native
  def toBoolean(input: String, strict: Boolean): Boolean = js.native
  def toDate(input: String): Date | Null = js.native
  def toFloat(input: String): Double = js.native
  def toInt(input: String): Double = js.native
  def toInt(input: String, radix: Double): Double = js.native
  def toString(input: js.Any): String = js.native
  def trim(input: String): String = js.native
  def trim(input: String, chars: String): String = js.native
  def unescape(input: String): String = js.native
  def whitelist(input: String, chars: String): String = js.native
}

