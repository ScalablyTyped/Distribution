package typings.scormBrowser

import typings.scormBrowser.cmidatatypesMod.CMIDecimal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cmivocabularyMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.scormBrowser.scormBrowserStrings.credit
    - typings.scormBrowser.scormBrowserStrings.`no-credit`
  */
  trait CMIVocabularyCredit extends StObject
  object CMIVocabularyCredit {
    
    inline def credit: typings.scormBrowser.scormBrowserStrings.credit = "credit".asInstanceOf[typings.scormBrowser.scormBrowserStrings.credit]
    
    inline def `no-credit`: typings.scormBrowser.scormBrowserStrings.`no-credit` = "no-credit".asInstanceOf[typings.scormBrowser.scormBrowserStrings.`no-credit`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.scormBrowser.scormBrowserStrings.`ab-initio`
    - typings.scormBrowser.scormBrowserStrings.resume
    - typings.scormBrowser.scormBrowserStrings._empty
  */
  trait CMIVocabularyEntry extends StObject
  object CMIVocabularyEntry {
    
    inline def _empty: typings.scormBrowser.scormBrowserStrings._empty = "".asInstanceOf[typings.scormBrowser.scormBrowserStrings._empty]
    
    inline def `ab-initio`: typings.scormBrowser.scormBrowserStrings.`ab-initio` = "ab-initio".asInstanceOf[typings.scormBrowser.scormBrowserStrings.`ab-initio`]
    
    inline def resume: typings.scormBrowser.scormBrowserStrings.resume = "resume".asInstanceOf[typings.scormBrowser.scormBrowserStrings.resume]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.scormBrowser.scormBrowserStrings.`time-out`
    - typings.scormBrowser.scormBrowserStrings.suspend
    - typings.scormBrowser.scormBrowserStrings.logout
    - typings.scormBrowser.scormBrowserStrings._empty
  */
  trait CMIVocabularyExit extends StObject
  object CMIVocabularyExit {
    
    inline def _empty: typings.scormBrowser.scormBrowserStrings._empty = "".asInstanceOf[typings.scormBrowser.scormBrowserStrings._empty]
    
    inline def logout: typings.scormBrowser.scormBrowserStrings.logout = "logout".asInstanceOf[typings.scormBrowser.scormBrowserStrings.logout]
    
    inline def suspend: typings.scormBrowser.scormBrowserStrings.suspend = "suspend".asInstanceOf[typings.scormBrowser.scormBrowserStrings.suspend]
    
    inline def `time-out`: typings.scormBrowser.scormBrowserStrings.`time-out` = "time-out".asInstanceOf[typings.scormBrowser.scormBrowserStrings.`time-out`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.scormBrowser.scormBrowserStrings.`true-false`
    - typings.scormBrowser.scormBrowserStrings.choice
    - typings.scormBrowser.scormBrowserStrings.`fill-in`
    - typings.scormBrowser.scormBrowserStrings.numeric
    - typings.scormBrowser.scormBrowserStrings.likert
    - typings.scormBrowser.scormBrowserStrings.matching
    - typings.scormBrowser.scormBrowserStrings.performance
    - typings.scormBrowser.scormBrowserStrings.sequencing
  */
  trait CMIVocabularyInteraction extends StObject
  object CMIVocabularyInteraction {
    
    inline def choice: typings.scormBrowser.scormBrowserStrings.choice = "choice".asInstanceOf[typings.scormBrowser.scormBrowserStrings.choice]
    
    inline def `fill-in`: typings.scormBrowser.scormBrowserStrings.`fill-in` = "fill-in".asInstanceOf[typings.scormBrowser.scormBrowserStrings.`fill-in`]
    
    inline def likert: typings.scormBrowser.scormBrowserStrings.likert = "likert".asInstanceOf[typings.scormBrowser.scormBrowserStrings.likert]
    
    inline def matching: typings.scormBrowser.scormBrowserStrings.matching = "matching".asInstanceOf[typings.scormBrowser.scormBrowserStrings.matching]
    
    inline def numeric: typings.scormBrowser.scormBrowserStrings.numeric = "numeric".asInstanceOf[typings.scormBrowser.scormBrowserStrings.numeric]
    
    inline def performance: typings.scormBrowser.scormBrowserStrings.performance = "performance".asInstanceOf[typings.scormBrowser.scormBrowserStrings.performance]
    
    inline def sequencing: typings.scormBrowser.scormBrowserStrings.sequencing = "sequencing".asInstanceOf[typings.scormBrowser.scormBrowserStrings.sequencing]
    
    inline def `true-false`: typings.scormBrowser.scormBrowserStrings.`true-false` = "true-false".asInstanceOf[typings.scormBrowser.scormBrowserStrings.`true-false`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.scormBrowser.scormBrowserStrings.normal
    - typings.scormBrowser.scormBrowserStrings.review
    - typings.scormBrowser.scormBrowserStrings.browse
  */
  trait CMIVocabularyMode extends StObject
  object CMIVocabularyMode {
    
    inline def browse: typings.scormBrowser.scormBrowserStrings.browse = "browse".asInstanceOf[typings.scormBrowser.scormBrowserStrings.browse]
    
    inline def normal: typings.scormBrowser.scormBrowserStrings.normal = "normal".asInstanceOf[typings.scormBrowser.scormBrowserStrings.normal]
    
    inline def review: typings.scormBrowser.scormBrowserStrings.review = "review".asInstanceOf[typings.scormBrowser.scormBrowserStrings.review]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.scormBrowser.scormBrowserStrings.correct
    - typings.scormBrowser.scormBrowserStrings.wrong
    - typings.scormBrowser.scormBrowserStrings.unanticipated
    - typings.scormBrowser.scormBrowserStrings.neutral
    - typings.scormBrowser.cmidatatypesMod.CMIDecimal
  */
  type CMIVocabularyResult = _CMIVocabularyResult | CMIDecimal
  
  /* Rewritten from type alias, can be one of: 
    - typings.scormBrowser.scormBrowserStrings.passed
    - typings.scormBrowser.scormBrowserStrings.completed
    - typings.scormBrowser.scormBrowserStrings.failed
    - typings.scormBrowser.scormBrowserStrings.incomplete
    - typings.scormBrowser.scormBrowserStrings.browsed
    - typings.scormBrowser.scormBrowserStrings.`not attempted`
  */
  trait CMIVocabularyStatus extends StObject
  object CMIVocabularyStatus {
    
    inline def browsed: typings.scormBrowser.scormBrowserStrings.browsed = "browsed".asInstanceOf[typings.scormBrowser.scormBrowserStrings.browsed]
    
    inline def completed: typings.scormBrowser.scormBrowserStrings.completed = "completed".asInstanceOf[typings.scormBrowser.scormBrowserStrings.completed]
    
    inline def failed: typings.scormBrowser.scormBrowserStrings.failed = "failed".asInstanceOf[typings.scormBrowser.scormBrowserStrings.failed]
    
    inline def incomplete: typings.scormBrowser.scormBrowserStrings.incomplete = "incomplete".asInstanceOf[typings.scormBrowser.scormBrowserStrings.incomplete]
    
    inline def `not attempted`: typings.scormBrowser.scormBrowserStrings.`not attempted` = ("not attempted").asInstanceOf[typings.scormBrowser.scormBrowserStrings.`not attempted`]
    
    inline def passed: typings.scormBrowser.scormBrowserStrings.passed = "passed".asInstanceOf[typings.scormBrowser.scormBrowserStrings.passed]
  }
  
  type CMIVocabularyTimeLimitAction = /* template literal string: ${exit|continue},${message|no message} */ String
  
  trait _CMIVocabularyResult extends StObject
}
