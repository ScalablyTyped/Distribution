package typings
package sarifLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object sarifLibStrings {
  @js.native
  sealed trait `2DOT1DOT0` extends js.Object
  
  @js.native
  sealed trait absent
    extends sarifLib.sarifMod.ResultNs.baselineState
  
  @js.native
  sealed trait accepted
    extends sarifLib.sarifMod.SuppressionNs.state
  
  @js.native
  sealed trait added
    extends sarifLib.sarifMod.ArtifactNs.roles
  
  @js.native
  sealed trait analysisTarget
    extends sarifLib.sarifMod.ArtifactNs.roles
  
  @js.native
  sealed trait attachment
    extends sarifLib.sarifMod.ArtifactNs.roles
  
  @js.native
  sealed trait debugOutputFile
    extends sarifLib.sarifMod.ArtifactNs.roles
  
  @js.native
  sealed trait deleted
    extends sarifLib.sarifMod.ArtifactNs.roles
  
  @js.native
  sealed trait directory
    extends sarifLib.sarifMod.ArtifactNs.roles
  
  @js.native
  sealed trait driver
    extends sarifLib.sarifMod.ArtifactNs.roles
  
  @js.native
  sealed trait error
    extends sarifLib.sarifMod.NotificationNs.level
       with sarifLib.sarifMod.ReportingConfigurationNs.level
       with sarifLib.sarifMod.ResultNs.level
  
  @js.native
  sealed trait essential
    extends sarifLib.sarifMod.ThreadFlowLocationNs.importance
  
  @js.native
  sealed trait extension
    extends sarifLib.sarifMod.ArtifactNs.roles
  
  @js.native
  sealed trait external
    extends sarifLib.sarifMod.SuppressionNs.kind
  
  @js.native
  sealed trait fail
    extends sarifLib.sarifMod.ResultNs.kind
  
  @js.native
  sealed trait important
    extends sarifLib.sarifMod.ThreadFlowLocationNs.importance
  
  @js.native
  sealed trait inSource
    extends sarifLib.sarifMod.SuppressionNs.kind
  
  @js.native
  sealed trait informational
    extends sarifLib.sarifMod.ResultNs.kind
  
  @js.native
  sealed trait localizedData
    extends sarifLib.sarifMod.ToolComponentNs.contents
  
  @js.native
  sealed trait memoryContents
    extends sarifLib.sarifMod.ArtifactNs.roles
  
  @js.native
  sealed trait modified
    extends sarifLib.sarifMod.ArtifactNs.roles
  
  @js.native
  sealed trait `new`
    extends sarifLib.sarifMod.ResultNs.baselineState
  
  @js.native
  sealed trait nonLocalizedData
    extends sarifLib.sarifMod.ToolComponentNs.contents
  
  @js.native
  sealed trait none
    extends sarifLib.sarifMod.NotificationNs.level
       with sarifLib.sarifMod.ReportingConfigurationNs.level
       with sarifLib.sarifMod.ResultNs.level
  
  @js.native
  sealed trait notApplicable
    extends sarifLib.sarifMod.ResultNs.kind
  
  @js.native
  sealed trait note
    extends sarifLib.sarifMod.NotificationNs.level
       with sarifLib.sarifMod.ReportingConfigurationNs.level
       with sarifLib.sarifMod.ResultNs.level
  
  @js.native
  sealed trait open
    extends sarifLib.sarifMod.ResultNs.kind
  
  @js.native
  sealed trait pass
    extends sarifLib.sarifMod.ResultNs.kind
  
  @js.native
  sealed trait policy
    extends sarifLib.sarifMod.ArtifactNs.roles
  
  @js.native
  sealed trait referencedOnCommandLine
    extends sarifLib.sarifMod.ArtifactNs.roles
  
  @js.native
  sealed trait rejected
    extends sarifLib.sarifMod.SuppressionNs.state
  
  @js.native
  sealed trait renamed
    extends sarifLib.sarifMod.ArtifactNs.roles
  
  @js.native
  sealed trait responseFile
    extends sarifLib.sarifMod.ArtifactNs.roles
  
  @js.native
  sealed trait resultFile
    extends sarifLib.sarifMod.ArtifactNs.roles
  
  @js.native
  sealed trait review
    extends sarifLib.sarifMod.ResultNs.kind
  
  @js.native
  sealed trait standardStream
    extends sarifLib.sarifMod.ArtifactNs.roles
  
  @js.native
  sealed trait taxonomy
    extends sarifLib.sarifMod.ArtifactNs.roles
  
  @js.native
  sealed trait toolSpecifiedConfiguration
    extends sarifLib.sarifMod.ArtifactNs.roles
  
  @js.native
  sealed trait tracedFile
    extends sarifLib.sarifMod.ArtifactNs.roles
  
  @js.native
  sealed trait translation
    extends sarifLib.sarifMod.ArtifactNs.roles
  
  @js.native
  sealed trait unchanged
    extends sarifLib.sarifMod.ResultNs.baselineState
  
  @js.native
  sealed trait uncontrolled
    extends sarifLib.sarifMod.ArtifactNs.roles
  
  @js.native
  sealed trait underReview
    extends sarifLib.sarifMod.SuppressionNs.state
  
  @js.native
  sealed trait unicodeCodePoints
    extends sarifLib.sarifMod.RunNs.columnKind
  
  @js.native
  sealed trait unimportant
    extends sarifLib.sarifMod.ThreadFlowLocationNs.importance
  
  @js.native
  sealed trait unmodified
    extends sarifLib.sarifMod.ArtifactNs.roles
  
  @js.native
  sealed trait updated
    extends sarifLib.sarifMod.ResultNs.baselineState
  
  @js.native
  sealed trait userSpecifiedConfiguration
    extends sarifLib.sarifMod.ArtifactNs.roles
  
  @js.native
  sealed trait utf16CodeUnits
    extends sarifLib.sarifMod.RunNs.columnKind
  
  @js.native
  sealed trait warning
    extends sarifLib.sarifMod.NotificationNs.level
       with sarifLib.sarifMod.ReportingConfigurationNs.level
       with sarifLib.sarifMod.ResultNs.level
  
  @scala.inline
  def `2DOT1DOT0`: `2DOT1DOT0` = "2.1.0".asInstanceOf[`2DOT1DOT0`]
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

