package typings
package servicenowLib.servicenowNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlideSystem extends js.Object {
  def addErrorMessage(message: java.lang.String): scala.Unit = js.native
  def addInfoMessage(message: java.lang.String): scala.Unit = js.native
  def base64Decode(source: java.lang.String): java.lang.String = js.native
  def base64Encode(source: java.lang.String): java.lang.String = js.native
  def beginningOfLastMonth(): java.lang.String = js.native
  def beginningOfLastWeek(): java.lang.String = js.native
  def beginningOfNextMonth(): java.lang.String = js.native
  def beginningOfNextWeek(): java.lang.String = js.native
  def beginningOfNextYear(): java.lang.String = js.native
  def beginningOfThisMonth(): java.lang.String = js.native
  def beginningOfThisQuarter(): java.lang.String = js.native
  def beginningOfThisWeek(): java.lang.String = js.native
  def beginningOfThisYear(): java.lang.String = js.native
  def dateGenerate(date: java.lang.String): java.lang.String = js.native
  def daysAgo(days: scala.Double): java.lang.String = js.native
  def daysAgoEnd(days: scala.Double): java.lang.String = js.native
  def daysAgoStart(days: scala.Double): java.lang.String = js.native
  def debug(message: java.lang.String): scala.Unit = js.native
  def debug(message: java.lang.String, parm1: js.Any): scala.Unit = js.native
  def debug(message: java.lang.String, parm1: js.Any, parm2: js.Any): scala.Unit = js.native
  def debug(message: java.lang.String, parm1: js.Any, parm2: js.Any, parm3: js.Any): scala.Unit = js.native
  def debug(message: java.lang.String, parm1: js.Any, parm2: js.Any, parm3: js.Any, parm4: js.Any): scala.Unit = js.native
  def debug(
    message: java.lang.String,
    parm1: js.Any,
    parm2: js.Any,
    parm3: js.Any,
    parm4: js.Any,
    parm5: js.Any
  ): scala.Unit = js.native
  def endOfLastMonth(): java.lang.String = js.native
  def endOfLastWeek(): java.lang.String = js.native
  def endOfLastYear(): java.lang.String = js.native
  def endOfNextMonth(): java.lang.String = js.native
  def endOfNextWeek(): java.lang.String = js.native
  def endOfNextYear(): java.lang.String = js.native
  def endOfThisMonth(): java.lang.String = js.native
  def endOfThisQuarter(): java.lang.String = js.native
  def endOfThisWeek(): java.lang.String = js.native
  def endOfThisYear(): java.lang.String = js.native
  def error(message: java.lang.String): scala.Unit = js.native
  def error(message: java.lang.String, parm1: js.Any): scala.Unit = js.native
  def error(message: java.lang.String, parm1: js.Any, parm2: js.Any): scala.Unit = js.native
  def error(message: java.lang.String, parm1: js.Any, parm2: js.Any, parm3: js.Any): scala.Unit = js.native
  def error(message: java.lang.String, parm1: js.Any, parm2: js.Any, parm3: js.Any, parm4: js.Any): scala.Unit = js.native
  def error(
    message: java.lang.String,
    parm1: js.Any,
    parm2: js.Any,
    parm3: js.Any,
    parm4: js.Any,
    parm5: js.Any
  ): scala.Unit = js.native
  def eventQueue(
    eventName: java.lang.String,
    gr: GlideRecord,
    optionalParam1: java.lang.String,
    optionalParam2: java.lang.String
  ): scala.Unit = js.native
  def eventQueue(
    eventName: java.lang.String,
    gr: GlideRecord,
    optionalParam1: java.lang.String,
    optionalParam2: java.lang.String,
    eventQueue: java.lang.String
  ): scala.Unit = js.native
  def eventQueueScheduled(
    name: java.lang.String,
    instance: GlideRecord,
    parm1: java.lang.String,
    parm2: java.lang.String,
    expiration: js.Object
  ): scala.Unit = js.native
  def executeNow(job: GlideRecord): java.lang.String = js.native
  def generateGUID(): java.lang.String = js.native
  def getCallerScopeName(): java.lang.String = js.native
  def getCssCacheVersionString(): java.lang.String = js.native
  def getCurrentApplicationId(): java.lang.String = js.native
  def getCurrentScopeName(): java.lang.String = js.native
  def getErrorMessages(id: java.lang.String): java.lang.String = js.native
  def getErrorMessages(id: java.lang.String, args: js.Array[java.lang.String]): java.lang.String = js.native
  def getMessage(id: java.lang.String): java.lang.String = js.native
  def getMessage(id: java.lang.String, `object`: js.Any): java.lang.String = js.native
  def getProperty(key: java.lang.String): js.Object = js.native
  def getProperty(key: java.lang.String, altobject: js.Object): js.Object = js.native
  def getSession(): java.lang.String | GlideSession = js.native
  def getSessionID(): java.lang.String = js.native
  def getSessionToken(): java.lang.String = js.native
  def getTimeZoneName(): java.lang.String = js.native
  def getUrlOnStack(): java.lang.String = js.native
  def getUser(): GlideUser = js.native
  def getUserDisplayName(): java.lang.String = js.native
  def getUserID(): java.lang.String = js.native
  def getUserName(): java.lang.String = js.native
  def getUserNameByUserID(id: java.lang.String): java.lang.String = js.native
  def hasRole(roleName: java.lang.String): scala.Boolean = js.native
  def include(include: java.lang.String): scala.Unit = js.native
  def info(message: java.lang.String): scala.Unit = js.native
  def info(message: java.lang.String, parm1: js.Any): scala.Unit = js.native
  def info(message: java.lang.String, parm1: js.Any, parm2: js.Any): scala.Unit = js.native
  def info(message: java.lang.String, parm1: js.Any, parm2: js.Any, parm3: js.Any): scala.Unit = js.native
  def info(message: java.lang.String, parm1: js.Any, parm2: js.Any, parm3: js.Any, parm4: js.Any): scala.Unit = js.native
  def info(
    message: java.lang.String,
    parm1: js.Any,
    parm2: js.Any,
    parm3: js.Any,
    parm4: js.Any,
    parm5: js.Any
  ): scala.Unit = js.native
  def isDebugging(): scala.Boolean = js.native
  def isInteractive(): scala.Boolean = js.native
  def isLoggedIn(): scala.Boolean = js.native
  def isMobile(): scala.Boolean = js.native
  def minutesAgoEnd(num: scala.Double): java.lang.String = js.native
  def minutesAgoStart(num: scala.Double): java.lang.String = js.native
  def monthsAgo(num: scala.Double): java.lang.String = js.native
  def monthsAgoEnd(num: scala.Double): java.lang.String = js.native
  def monthsAgoStart(num: scala.Double): java.lang.String = js.native
  def nil(`object`: js.Any): scala.Boolean = js.native
  def quartersAgoEnd(num: scala.Double): java.lang.String = js.native
  def quartersAgoStart(num: scala.Double): java.lang.String = js.native
  def setRedirect(uri: java.lang.String): scala.Unit = js.native
  def tableExists(table: java.lang.String): scala.Boolean = js.native
  def warn(message: java.lang.String): scala.Unit = js.native
  def warn(message: java.lang.String, parm1: js.Any): scala.Unit = js.native
  def warn(message: java.lang.String, parm1: js.Any, parm2: js.Any): scala.Unit = js.native
  def warn(message: java.lang.String, parm1: js.Any, parm2: js.Any, parm3: js.Any): scala.Unit = js.native
  def warn(message: java.lang.String, parm1: js.Any, parm2: js.Any, parm3: js.Any, parm4: js.Any): scala.Unit = js.native
  def warn(
    message: java.lang.String,
    parm1: js.Any,
    parm2: js.Any,
    parm3: js.Any,
    parm4: js.Any,
    parm5: js.Any
  ): scala.Unit = js.native
  def xmlToJSON(xml: java.lang.String): js.Any = js.native
  def yearsAgo(years: scala.Double): java.lang.String = js.native
  def yesterday(): java.lang.String = js.native
}

