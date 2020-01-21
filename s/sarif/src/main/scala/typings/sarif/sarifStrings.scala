package typings.sarif

import typings.sarif.mod.Artifact.roles
import typings.sarif.mod.ReportingConfiguration.level
import typings.sarif.mod.Result.baselineState
import typings.sarif.mod.Run.columnKind
import typings.sarif.mod.Suppression.kind
import typings.sarif.mod.Suppression.state
import typings.sarif.mod.ThreadFlowLocation.importance
import typings.sarif.mod.ToolComponent.contents
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object sarifStrings {
  @js.native
  sealed trait `2Dot1Dot0` extends js.Object
  
  @js.native
  sealed trait absent extends baselineState
  
  @js.native
  sealed trait accepted extends state
  
  @js.native
  sealed trait added extends roles
  
  @js.native
  sealed trait analysisTarget extends roles
  
  @js.native
  sealed trait attachment extends roles
  
  @js.native
  sealed trait debugOutputFile extends roles
  
  @js.native
  sealed trait deleted extends roles
  
  @js.native
  sealed trait directory extends roles
  
  @js.native
  sealed trait driver extends roles
  
  @js.native
  sealed trait error
    extends level
       with typings.sarif.mod.Notification.level
       with typings.sarif.mod.Result.level
  
  @js.native
  sealed trait essential extends importance
  
  @js.native
  sealed trait extension extends roles
  
  @js.native
  sealed trait external extends kind
  
  @js.native
  sealed trait fail
    extends typings.sarif.mod.Result.kind
  
  @js.native
  sealed trait important extends importance
  
  @js.native
  sealed trait inSource extends kind
  
  @js.native
  sealed trait informational
    extends typings.sarif.mod.Result.kind
  
  @js.native
  sealed trait localizedData extends contents
  
  @js.native
  sealed trait memoryContents extends roles
  
  @js.native
  sealed trait modified extends roles
  
  @js.native
  sealed trait `new` extends baselineState
  
  @js.native
  sealed trait nonLocalizedData extends contents
  
  @js.native
  sealed trait none
    extends level
       with typings.sarif.mod.Notification.level
       with typings.sarif.mod.Result.level
  
  @js.native
  sealed trait notApplicable
    extends typings.sarif.mod.Result.kind
  
  @js.native
  sealed trait note
    extends level
       with typings.sarif.mod.Notification.level
       with typings.sarif.mod.Result.level
  
  @js.native
  sealed trait open
    extends typings.sarif.mod.Result.kind
  
  @js.native
  sealed trait pass
    extends typings.sarif.mod.Result.kind
  
  @js.native
  sealed trait policy extends roles
  
  @js.native
  sealed trait referencedOnCommandLine extends roles
  
  @js.native
  sealed trait rejected extends state
  
  @js.native
  sealed trait renamed extends roles
  
  @js.native
  sealed trait responseFile extends roles
  
  @js.native
  sealed trait resultFile extends roles
  
  @js.native
  sealed trait review
    extends typings.sarif.mod.Result.kind
  
  @js.native
  sealed trait standardStream extends roles
  
  @js.native
  sealed trait taxonomy extends roles
  
  @js.native
  sealed trait toolSpecifiedConfiguration extends roles
  
  @js.native
  sealed trait tracedFile extends roles
  
  @js.native
  sealed trait translation extends roles
  
  @js.native
  sealed trait unchanged extends baselineState
  
  @js.native
  sealed trait uncontrolled extends roles
  
  @js.native
  sealed trait underReview extends state
  
  @js.native
  sealed trait unicodeCodePoints extends columnKind
  
  @js.native
  sealed trait unimportant extends importance
  
  @js.native
  sealed trait unmodified extends roles
  
  @js.native
  sealed trait updated extends baselineState
  
  @js.native
  sealed trait userSpecifiedConfiguration extends roles
  
  @js.native
  sealed trait utf16CodeUnits extends columnKind
  
  @js.native
  sealed trait warning
    extends level
       with typings.sarif.mod.Notification.level
       with typings.sarif.mod.Result.level
  
  @scala.inline
  def `2Dot1Dot0`: `2Dot1Dot0` = "2.1.0".asInstanceOf[`2Dot1Dot0`]
  @scala.inline
  def absent: absent = "absent".asInstanceOf[absent]
  @scala.inline
  def accepted: accepted = "accepted".asInstanceOf[accepted]
  @scala.inline
  def added: added = "added".asInstanceOf[added]
  @scala.inline
  def analysisTarget: analysisTarget = "analysisTarget".asInstanceOf[analysisTarget]
  @scala.inline
  def attachment: attachment = "attachment".asInstanceOf[attachment]
  @scala.inline
  def debugOutputFile: debugOutputFile = "debugOutputFile".asInstanceOf[debugOutputFile]
  @scala.inline
  def deleted: deleted = "deleted".asInstanceOf[deleted]
  @scala.inline
  def directory: directory = "directory".asInstanceOf[directory]
  @scala.inline
  def driver: driver = "driver".asInstanceOf[driver]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def essential: essential = "essential".asInstanceOf[essential]
  @scala.inline
  def extension: extension = "extension".asInstanceOf[extension]
  @scala.inline
  def external: external = "external".asInstanceOf[external]
  @scala.inline
  def fail: fail = "fail".asInstanceOf[fail]
  @scala.inline
  def important: important = "important".asInstanceOf[important]
  @scala.inline
  def inSource: inSource = "inSource".asInstanceOf[inSource]
  @scala.inline
  def informational: informational = "informational".asInstanceOf[informational]
  @scala.inline
  def localizedData: localizedData = "localizedData".asInstanceOf[localizedData]
  @scala.inline
  def memoryContents: memoryContents = "memoryContents".asInstanceOf[memoryContents]
  @scala.inline
  def modified: modified = "modified".asInstanceOf[modified]
  @scala.inline
  def `new`: `new` = "new".asInstanceOf[`new`]
  @scala.inline
  def nonLocalizedData: nonLocalizedData = "nonLocalizedData".asInstanceOf[nonLocalizedData]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def notApplicable: notApplicable = "notApplicable".asInstanceOf[notApplicable]
  @scala.inline
  def note: note = "note".asInstanceOf[note]
  @scala.inline
  def open: open = "open".asInstanceOf[open]
  @scala.inline
  def pass: pass = "pass".asInstanceOf[pass]
  @scala.inline
  def policy: policy = "policy".asInstanceOf[policy]
  @scala.inline
  def referencedOnCommandLine: referencedOnCommandLine = "referencedOnCommandLine".asInstanceOf[referencedOnCommandLine]
  @scala.inline
  def rejected: rejected = "rejected".asInstanceOf[rejected]
  @scala.inline
  def renamed: renamed = "renamed".asInstanceOf[renamed]
  @scala.inline
  def responseFile: responseFile = "responseFile".asInstanceOf[responseFile]
  @scala.inline
  def resultFile: resultFile = "resultFile".asInstanceOf[resultFile]
  @scala.inline
  def review: review = "review".asInstanceOf[review]
  @scala.inline
  def standardStream: standardStream = "standardStream".asInstanceOf[standardStream]
  @scala.inline
  def taxonomy: taxonomy = "taxonomy".asInstanceOf[taxonomy]
  @scala.inline
  def toolSpecifiedConfiguration: toolSpecifiedConfiguration = "toolSpecifiedConfiguration".asInstanceOf[toolSpecifiedConfiguration]
  @scala.inline
  def tracedFile: tracedFile = "tracedFile".asInstanceOf[tracedFile]
  @scala.inline
  def translation: translation = "translation".asInstanceOf[translation]
  @scala.inline
  def unchanged: unchanged = "unchanged".asInstanceOf[unchanged]
  @scala.inline
  def uncontrolled: uncontrolled = "uncontrolled".asInstanceOf[uncontrolled]
  @scala.inline
  def underReview: underReview = "underReview".asInstanceOf[underReview]
  @scala.inline
  def unicodeCodePoints: unicodeCodePoints = "unicodeCodePoints".asInstanceOf[unicodeCodePoints]
  @scala.inline
  def unimportant: unimportant = "unimportant".asInstanceOf[unimportant]
  @scala.inline
  def unmodified: unmodified = "unmodified".asInstanceOf[unmodified]
  @scala.inline
  def updated: updated = "updated".asInstanceOf[updated]
  @scala.inline
  def userSpecifiedConfiguration: userSpecifiedConfiguration = "userSpecifiedConfiguration".asInstanceOf[userSpecifiedConfiguration]
  @scala.inline
  def utf16CodeUnits: utf16CodeUnits = "utf16CodeUnits".asInstanceOf[utf16CodeUnits]
  @scala.inline
  def warning: warning = "warning".asInstanceOf[warning]
}

