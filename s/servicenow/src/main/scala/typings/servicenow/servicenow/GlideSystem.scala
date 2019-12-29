package typings.servicenow.servicenow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlideSystem extends js.Object {
  def addErrorMessage(message: String): Unit = js.native
  def addInfoMessage(message: String): Unit = js.native
  def base64Decode(source: String): String = js.native
  def base64Encode(source: String): String = js.native
  def beginningOfLastMonth(): String = js.native
  def beginningOfLastWeek(): String = js.native
  def beginningOfNextMonth(): String = js.native
  def beginningOfNextWeek(): String = js.native
  def beginningOfNextYear(): String = js.native
  def beginningOfThisMonth(): String = js.native
  def beginningOfThisQuarter(): String = js.native
  def beginningOfThisWeek(): String = js.native
  def beginningOfThisYear(): String = js.native
  def dateGenerate(date: String): String = js.native
  def daysAgo(days: Double): String = js.native
  def daysAgoEnd(days: Double): String = js.native
  def daysAgoStart(days: Double): String = js.native
  def debug(message: String): Unit = js.native
  def debug(message: String, parm1: js.Any): Unit = js.native
  def debug(message: String, parm1: js.Any, parm2: js.Any): Unit = js.native
  def debug(message: String, parm1: js.Any, parm2: js.Any, parm3: js.Any): Unit = js.native
  def debug(message: String, parm1: js.Any, parm2: js.Any, parm3: js.Any, parm4: js.Any): Unit = js.native
  def debug(message: String, parm1: js.Any, parm2: js.Any, parm3: js.Any, parm4: js.Any, parm5: js.Any): Unit = js.native
  def endOfLastMonth(): String = js.native
  def endOfLastWeek(): String = js.native
  def endOfLastYear(): String = js.native
  def endOfNextMonth(): String = js.native
  def endOfNextWeek(): String = js.native
  def endOfNextYear(): String = js.native
  def endOfThisMonth(): String = js.native
  def endOfThisQuarter(): String = js.native
  def endOfThisWeek(): String = js.native
  def endOfThisYear(): String = js.native
  def error(message: String): Unit = js.native
  def error(message: String, parm1: js.Any): Unit = js.native
  def error(message: String, parm1: js.Any, parm2: js.Any): Unit = js.native
  def error(message: String, parm1: js.Any, parm2: js.Any, parm3: js.Any): Unit = js.native
  def error(message: String, parm1: js.Any, parm2: js.Any, parm3: js.Any, parm4: js.Any): Unit = js.native
  def error(message: String, parm1: js.Any, parm2: js.Any, parm3: js.Any, parm4: js.Any, parm5: js.Any): Unit = js.native
  def eventQueue(eventName: String, gr: GlideRecord, optionalParam1: String, optionalParam2: String): Unit = js.native
  def eventQueue(
    eventName: String,
    gr: GlideRecord,
    optionalParam1: String,
    optionalParam2: String,
    eventQueue: String
  ): Unit = js.native
  def eventQueueScheduled(name: String, instance: GlideRecord, parm1: String, parm2: String, expiration: js.Object): Unit = js.native
  def executeNow(job: GlideRecord): String = js.native
  def generateGUID(): String = js.native
  def getCallerScopeName(): String = js.native
  def getCssCacheVersionString(): String = js.native
  def getCurrentApplicationId(): String = js.native
  def getCurrentScopeName(): String = js.native
  def getErrorMessages(id: String): String = js.native
  def getErrorMessages(id: String, args: js.Array[String]): String = js.native
  def getMessage(id: String): String = js.native
  def getMessage(id: String, `object`: js.Any): String = js.native
  def getProperty(key: String): js.Object = js.native
  def getProperty(key: String, altobject: js.Object): js.Object = js.native
  def getSession(): String | GlideSession = js.native
  def getSessionID(): String = js.native
  def getSessionToken(): String = js.native
  def getTimeZoneName(): String = js.native
  def getUrlOnStack(): String = js.native
  def getUser(): GlideUser = js.native
  def getUserDisplayName(): String = js.native
  def getUserID(): String = js.native
  def getUserName(): String = js.native
  def getUserNameByUserID(id: String): String = js.native
  def hasRole(roleName: String): Boolean = js.native
  def include(include: String): Unit = js.native
  def info(message: String): Unit = js.native
  def info(message: String, parm1: js.Any): Unit = js.native
  def info(message: String, parm1: js.Any, parm2: js.Any): Unit = js.native
  def info(message: String, parm1: js.Any, parm2: js.Any, parm3: js.Any): Unit = js.native
  def info(message: String, parm1: js.Any, parm2: js.Any, parm3: js.Any, parm4: js.Any): Unit = js.native
  def info(message: String, parm1: js.Any, parm2: js.Any, parm3: js.Any, parm4: js.Any, parm5: js.Any): Unit = js.native
  def isDebugging(): Boolean = js.native
  def isInteractive(): Boolean = js.native
  def isLoggedIn(): Boolean = js.native
  def isMobile(): Boolean = js.native
  def minutesAgoEnd(num: Double): String = js.native
  def minutesAgoStart(num: Double): String = js.native
  def monthsAgo(num: Double): String = js.native
  def monthsAgoEnd(num: Double): String = js.native
  def monthsAgoStart(num: Double): String = js.native
  def nil(`object`: js.Any): Boolean = js.native
  def quartersAgoEnd(num: Double): String = js.native
  def quartersAgoStart(num: Double): String = js.native
  def setRedirect(uri: String): Unit = js.native
  def tableExists(table: String): Boolean = js.native
  def warn(message: String): Unit = js.native
  def warn(message: String, parm1: js.Any): Unit = js.native
  def warn(message: String, parm1: js.Any, parm2: js.Any): Unit = js.native
  def warn(message: String, parm1: js.Any, parm2: js.Any, parm3: js.Any): Unit = js.native
  def warn(message: String, parm1: js.Any, parm2: js.Any, parm3: js.Any, parm4: js.Any): Unit = js.native
  def warn(message: String, parm1: js.Any, parm2: js.Any, parm3: js.Any, parm4: js.Any, parm5: js.Any): Unit = js.native
  def xmlToJSON(xml: String): js.Any = js.native
  def yearsAgo(years: Double): String = js.native
  def yesterday(): String = js.native
}

