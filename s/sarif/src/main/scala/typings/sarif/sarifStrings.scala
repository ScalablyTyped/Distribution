package typings.sarif

import typings.sarif.mod.Artifact.roles
import typings.sarif.mod.ReportingConfiguration.level
import typings.sarif.mod.Result.baselineState
import typings.sarif.mod.Run.columnKind
import typings.sarif.mod.Suppression.kind
import typings.sarif.mod.Suppression.status
import typings.sarif.mod.ThreadFlowLocation.importance
import typings.sarif.mod.ToolComponent.contents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sarifStrings {
  
  @js.native
  sealed trait `2Dot1Dot0` extends StObject
  @scala.inline
  def `2Dot1Dot0`: `2Dot1Dot0` = "2.1.0".asInstanceOf[`2Dot1Dot0`]
  
  @js.native
  sealed trait absent
    extends StObject
       with baselineState
  @scala.inline
  def absent: absent = "absent".asInstanceOf[absent]
  
  @js.native
  sealed trait accepted
    extends StObject
       with status
  @scala.inline
  def accepted: accepted = "accepted".asInstanceOf[accepted]
  
  @js.native
  sealed trait added
    extends StObject
       with roles
  @scala.inline
  def added: added = "added".asInstanceOf[added]
  
  @js.native
  sealed trait analysisTarget
    extends StObject
       with roles
  @scala.inline
  def analysisTarget: analysisTarget = "analysisTarget".asInstanceOf[analysisTarget]
  
  @js.native
  sealed trait attachment
    extends StObject
       with roles
  @scala.inline
  def attachment: attachment = "attachment".asInstanceOf[attachment]
  
  @js.native
  sealed trait debugOutputFile
    extends StObject
       with roles
  @scala.inline
  def debugOutputFile: debugOutputFile = "debugOutputFile".asInstanceOf[debugOutputFile]
  
  @js.native
  sealed trait deleted
    extends StObject
       with roles
  @scala.inline
  def deleted: deleted = "deleted".asInstanceOf[deleted]
  
  @js.native
  sealed trait directory
    extends StObject
       with roles
  @scala.inline
  def directory: directory = "directory".asInstanceOf[directory]
  
  @js.native
  sealed trait driver
    extends StObject
       with roles
  @scala.inline
  def driver: driver = "driver".asInstanceOf[driver]
  
  @js.native
  sealed trait error
    extends StObject
       with level
       with typings.sarif.mod.Notification.level
       with typings.sarif.mod.Result.level
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait essential
    extends StObject
       with importance
  @scala.inline
  def essential: essential = "essential".asInstanceOf[essential]
  
  @js.native
  sealed trait `extension`
    extends StObject
       with roles
  @scala.inline
  def `extension`: `extension` = "extension".asInstanceOf[`extension`]
  
  @js.native
  sealed trait external
    extends StObject
       with kind
  @scala.inline
  def external: external = "external".asInstanceOf[external]
  
  @js.native
  sealed trait fail
    extends StObject
       with typings.sarif.mod.Result.kind
  @scala.inline
  def fail: fail = "fail".asInstanceOf[fail]
  
  @js.native
  sealed trait important
    extends StObject
       with importance
  @scala.inline
  def important: important = "important".asInstanceOf[important]
  
  @js.native
  sealed trait inSource
    extends StObject
       with kind
  @scala.inline
  def inSource: inSource = "inSource".asInstanceOf[inSource]
  
  @js.native
  sealed trait informational
    extends StObject
       with typings.sarif.mod.Result.kind
  @scala.inline
  def informational: informational = "informational".asInstanceOf[informational]
  
  @js.native
  sealed trait localizedData
    extends StObject
       with contents
  @scala.inline
  def localizedData: localizedData = "localizedData".asInstanceOf[localizedData]
  
  @js.native
  sealed trait memoryContents
    extends StObject
       with roles
  @scala.inline
  def memoryContents: memoryContents = "memoryContents".asInstanceOf[memoryContents]
  
  @js.native
  sealed trait modified
    extends StObject
       with roles
  @scala.inline
  def modified: modified = "modified".asInstanceOf[modified]
  
  @js.native
  sealed trait `new`
    extends StObject
       with baselineState
  @scala.inline
  def `new`: `new` = "new".asInstanceOf[`new`]
  
  @js.native
  sealed trait nonLocalizedData
    extends StObject
       with contents
  @scala.inline
  def nonLocalizedData: nonLocalizedData = "nonLocalizedData".asInstanceOf[nonLocalizedData]
  
  @js.native
  sealed trait none
    extends StObject
       with level
       with typings.sarif.mod.Notification.level
       with typings.sarif.mod.Result.level
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait notApplicable
    extends StObject
       with typings.sarif.mod.Result.kind
  @scala.inline
  def notApplicable: notApplicable = "notApplicable".asInstanceOf[notApplicable]
  
  @js.native
  sealed trait note
    extends StObject
       with level
       with typings.sarif.mod.Notification.level
       with typings.sarif.mod.Result.level
  @scala.inline
  def note: note = "note".asInstanceOf[note]
  
  @js.native
  sealed trait open
    extends StObject
       with typings.sarif.mod.Result.kind
  @scala.inline
  def open: open = "open".asInstanceOf[open]
  
  @js.native
  sealed trait pass
    extends StObject
       with typings.sarif.mod.Result.kind
  @scala.inline
  def pass: pass = "pass".asInstanceOf[pass]
  
  @js.native
  sealed trait policy
    extends StObject
       with roles
  @scala.inline
  def policy: policy = "policy".asInstanceOf[policy]
  
  @js.native
  sealed trait referencedOnCommandLine
    extends StObject
       with roles
  @scala.inline
  def referencedOnCommandLine: referencedOnCommandLine = "referencedOnCommandLine".asInstanceOf[referencedOnCommandLine]
  
  @js.native
  sealed trait rejected
    extends StObject
       with status
  @scala.inline
  def rejected: rejected = "rejected".asInstanceOf[rejected]
  
  @js.native
  sealed trait renamed
    extends StObject
       with roles
  @scala.inline
  def renamed: renamed = "renamed".asInstanceOf[renamed]
  
  @js.native
  sealed trait responseFile
    extends StObject
       with roles
  @scala.inline
  def responseFile: responseFile = "responseFile".asInstanceOf[responseFile]
  
  @js.native
  sealed trait resultFile
    extends StObject
       with roles
  @scala.inline
  def resultFile: resultFile = "resultFile".asInstanceOf[resultFile]
  
  @js.native
  sealed trait review
    extends StObject
       with typings.sarif.mod.Result.kind
  @scala.inline
  def review: review = "review".asInstanceOf[review]
  
  @js.native
  sealed trait standardStream
    extends StObject
       with roles
  @scala.inline
  def standardStream: standardStream = "standardStream".asInstanceOf[standardStream]
  
  @js.native
  sealed trait taxonomy
    extends StObject
       with roles
  @scala.inline
  def taxonomy: taxonomy = "taxonomy".asInstanceOf[taxonomy]
  
  @js.native
  sealed trait toolSpecifiedConfiguration
    extends StObject
       with roles
  @scala.inline
  def toolSpecifiedConfiguration: toolSpecifiedConfiguration = "toolSpecifiedConfiguration".asInstanceOf[toolSpecifiedConfiguration]
  
  @js.native
  sealed trait tracedFile
    extends StObject
       with roles
  @scala.inline
  def tracedFile: tracedFile = "tracedFile".asInstanceOf[tracedFile]
  
  @js.native
  sealed trait translation
    extends StObject
       with roles
  @scala.inline
  def translation: translation = "translation".asInstanceOf[translation]
  
  @js.native
  sealed trait unchanged
    extends StObject
       with baselineState
  @scala.inline
  def unchanged: unchanged = "unchanged".asInstanceOf[unchanged]
  
  @js.native
  sealed trait uncontrolled
    extends StObject
       with roles
  @scala.inline
  def uncontrolled: uncontrolled = "uncontrolled".asInstanceOf[uncontrolled]
  
  @js.native
  sealed trait underReview
    extends StObject
       with status
  @scala.inline
  def underReview: underReview = "underReview".asInstanceOf[underReview]
  
  @js.native
  sealed trait unicodeCodePoints
    extends StObject
       with columnKind
  @scala.inline
  def unicodeCodePoints: unicodeCodePoints = "unicodeCodePoints".asInstanceOf[unicodeCodePoints]
  
  @js.native
  sealed trait unimportant
    extends StObject
       with importance
  @scala.inline
  def unimportant: unimportant = "unimportant".asInstanceOf[unimportant]
  
  @js.native
  sealed trait unmodified
    extends StObject
       with roles
  @scala.inline
  def unmodified: unmodified = "unmodified".asInstanceOf[unmodified]
  
  @js.native
  sealed trait updated
    extends StObject
       with baselineState
  @scala.inline
  def updated: updated = "updated".asInstanceOf[updated]
  
  @js.native
  sealed trait userSpecifiedConfiguration
    extends StObject
       with roles
  @scala.inline
  def userSpecifiedConfiguration: userSpecifiedConfiguration = "userSpecifiedConfiguration".asInstanceOf[userSpecifiedConfiguration]
  
  @js.native
  sealed trait utf16CodeUnits
    extends StObject
       with columnKind
  @scala.inline
  def utf16CodeUnits: utf16CodeUnits = "utf16CodeUnits".asInstanceOf[utf16CodeUnits]
  
  @js.native
  sealed trait warning
    extends StObject
       with level
       with typings.sarif.mod.Notification.level
       with typings.sarif.mod.Result.level
  @scala.inline
  def warning: warning = "warning".asInstanceOf[warning]
}
