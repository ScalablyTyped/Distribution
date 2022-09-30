package typings.scormBrowser

import typings.scormBrowser.cmidatatypesMod.CMIBlank
import typings.scormBrowser.cmidatatypesMod.CMIBoolean
import typings.scormBrowser.cmidatatypesMod.CMIDecimal
import typings.scormBrowser.cmidatatypesMod.CMIFeedback
import typings.scormBrowser.cmidatatypesMod.CMIIdentifier
import typings.scormBrowser.cmidatatypesMod.CMIInteger
import typings.scormBrowser.cmidatatypesMod.CMISInteger
import typings.scormBrowser.cmidatatypesMod.CMIString255
import typings.scormBrowser.cmidatatypesMod.CMIString4096
import typings.scormBrowser.cmidatatypesMod.CMITime
import typings.scormBrowser.cmidatatypesMod.CMITimeSpan
import typings.scormBrowser.cmielementMod.CMIElementComments
import typings.scormBrowser.cmielementMod.CMIElementCommentsFromLMS
import typings.scormBrowser.cmielementMod.CMIElementCoreChildren
import typings.scormBrowser.cmielementMod.CMIElementCoreCredit
import typings.scormBrowser.cmielementMod.CMIElementCoreEntry
import typings.scormBrowser.cmielementMod.CMIElementCoreExit
import typings.scormBrowser.cmielementMod.CMIElementCoreLessonLocation
import typings.scormBrowser.cmielementMod.CMIElementCoreLessonMode
import typings.scormBrowser.cmielementMod.CMIElementCoreLessonStatus
import typings.scormBrowser.cmielementMod.CMIElementCoreScoreChildren
import typings.scormBrowser.cmielementMod.CMIElementCoreScoreMax
import typings.scormBrowser.cmielementMod.CMIElementCoreScoreMin
import typings.scormBrowser.cmielementMod.CMIElementCoreScoreRaw
import typings.scormBrowser.cmielementMod.CMIElementCoreSessionTime
import typings.scormBrowser.cmielementMod.CMIElementCoreStudentId
import typings.scormBrowser.cmielementMod.CMIElementCoreStudentName
import typings.scormBrowser.cmielementMod.CMIElementCoreTotalTime
import typings.scormBrowser.cmielementMod.CMIElementInteractionsChildren
import typings.scormBrowser.cmielementMod.CMIElementInteractionsCount
import typings.scormBrowser.cmielementMod.CMIElementInteractionsNCorrectResponsesCount
import typings.scormBrowser.cmielementMod.CMIElementInteractionsNCorrectResponsesNPattern
import typings.scormBrowser.cmielementMod.CMIElementInteractionsNID
import typings.scormBrowser.cmielementMod.CMIElementInteractionsNLatency
import typings.scormBrowser.cmielementMod.CMIElementInteractionsNObjectivesCount
import typings.scormBrowser.cmielementMod.CMIElementInteractionsNResult
import typings.scormBrowser.cmielementMod.CMIElementInteractionsNStudentResponse
import typings.scormBrowser.cmielementMod.CMIElementInteractionsNTime
import typings.scormBrowser.cmielementMod.CMIElementInteractionsNType
import typings.scormBrowser.cmielementMod.CMIElementInteractionsNWeighting
import typings.scormBrowser.cmielementMod.CMIElementLaunchData
import typings.scormBrowser.cmielementMod.CMIElementObjectivesChildren
import typings.scormBrowser.cmielementMod.CMIElementObjectivesCount
import typings.scormBrowser.cmielementMod.CMIElementObjectivesNID
import typings.scormBrowser.cmielementMod.CMIElementObjectivesNScoreChildren
import typings.scormBrowser.cmielementMod.CMIElementObjectivesNScoreMax
import typings.scormBrowser.cmielementMod.CMIElementObjectivesNScoreMin
import typings.scormBrowser.cmielementMod.CMIElementObjectivesNScoreRaw
import typings.scormBrowser.cmielementMod.CMIElementObjectivesNStatus
import typings.scormBrowser.cmielementMod.CMIElementStudentDataChildren
import typings.scormBrowser.cmielementMod.CMIElementStudentDataMasteryScore
import typings.scormBrowser.cmielementMod.CMIElementStudentDataMaxTimeAllowed
import typings.scormBrowser.cmielementMod.CMIElementStudentDataTimeLimitAction
import typings.scormBrowser.cmielementMod.CMIElementStudentPreferenceAudio
import typings.scormBrowser.cmielementMod.CMIElementStudentPreferenceChildren
import typings.scormBrowser.cmielementMod.CMIElementStudentPreferenceLanguage
import typings.scormBrowser.cmielementMod.CMIElementStudentPreferenceSpeed
import typings.scormBrowser.cmielementMod.CMIElementStudentPreferenceText
import typings.scormBrowser.cmielementMod.CMIElementSuspendData
import typings.scormBrowser.cmielementMod.CMIElementVersion
import typings.scormBrowser.cmierrorcodeMod.CMIErrorCode
import typings.scormBrowser.cmivocabularyMod.CMIVocabularyCredit
import typings.scormBrowser.cmivocabularyMod.CMIVocabularyEntry
import typings.scormBrowser.cmivocabularyMod.CMIVocabularyExit
import typings.scormBrowser.cmivocabularyMod.CMIVocabularyInteraction
import typings.scormBrowser.cmivocabularyMod.CMIVocabularyMode
import typings.scormBrowser.cmivocabularyMod.CMIVocabularyResult
import typings.scormBrowser.cmivocabularyMod.CMIVocabularyStatus
import typings.scormBrowser.cmivocabularyMod.CMIVocabularyTimeLimitAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `12Mod` {
  
  @js.native
  trait SCORM12 extends StObject {
    
    /**
      * Indicates to the LMS that all data should be persisted (not required).
      * @param param The “” parameter is required by all SCORM methods that don’t accept any other arguments.
      */
    def LMSCommit(param: CMIBlank): CMIBoolean = js.native
    
    /**
      * Ends a communication session with the LMS.
      * @param param The “” parameter is required by all SCORM methods that don’t accept any other arguments.
      */
    def LMSFinish(param: CMIBlank): CMIBoolean = js.native
    
    /**
      * Returns detailed information about the last error that occurred.
      * @param errorCode The CMIErrorCode data type is a three-digit number, represented by a string, that corresponds to one of the SCORM Run-Time error codes.
      */
    def LMSGetDiagnostic(errorCode: CMIErrorCode): String = js.native
    
    /**
      * Returns a short string describing the specified error code.
      * @param errorCode The CMIErrorCode data type is a three-digit number, represented by a string, that corresponds to one of the SCORM Run-Time error codes.
      */
    def LMSGetErrorString(errorCode: CMIErrorCode): String = js.native
    
    // State Management
    /**
      * Returns the error code that resulted from the last API call.
      */
    def LMSGetLastError(): CMIErrorCode = js.native
    
    /**
      * The _count keyword is used to determine the current number of records in the cmi.interactions objective id list. The total number of entries is returned. If the SCO does not know the count of
      * the cmi.interactions.n.objecives records, it can begin the current student count with 0. This would overwrite any information about objective ids currently stored in the first index position.
      * Overwriting or appending is a decision that is made by the SCO author when he/she creates the SCO.
      */
    // tslint:disable-next-line:unified-signatures
    /**
      * The _count keyword is used to determine the current number of records in the cmi.interactions correct responses list. The total number of entries is returned. If the SCO does not know the
      * count of the cmi.interactions.n.correct_responses records, it can begin the current student count with 0. This would overwrite any information about correct responses currently stored in the
      * first index position. Overwriting or appending is a decision that is made by the SCO author when he/she creates the SCO.
      */
    def LMSGetValue(element: CMIElementInteractionsNCorrectResponsesCount | CMIElementInteractionsNObjectivesCount): CMIInteger = js.native
    /**
      * Freeform feedback from the SCO. For example, the student may have the option of leaving comments at any point in the SCO, or they may be asked for comments at the end of the SCO. The comment
      * may also have an indication of where or when in the SCO it was created. A location may be tagged and embedded in the comment.
      */
    // tslint:disable-next-line:unified-signatures
    def LMSGetValue(element: CMIElementComments): CMIString4096 = js.native
    /**
      * This element represents comments that would come from the LMS. An example of how this might be used is in the form of instructor comments. These types of comments are directed at the student
      * that the SCO may present to the student when appropriate.
      */
    // tslint:disable-next-line:unified-signatures
    def LMSGetValue(element: CMIElementCommentsFromLMS): CMIString4096 = js.native
    // Data Transfer
    /**
      * The _children keyword is used to determine all of the elements in the core category that are supported by the LMS. If an element has no children, but is supported, an empty string is returned.
      * If an element is not supported, an empty string is returned. A subsequent request for last error can verify that the element is not supported.
      */
    // tslint:disable-next-line:unified-signatures
    def LMSGetValue(element: CMIElementCoreChildren): CMIString255 = js.native
    /**
      * Indicates whether the student is being credited by the LMS system based on performance (pass/fail and score) in this SCO.
      */
    // tslint:disable-next-line:unified-signatures
    def LMSGetValue(element: CMIElementCoreCredit): CMIVocabularyCredit = js.native
    /**
      * Indication of whether the student has been in the SCO before.
      */
    // tslint:disable-next-line:unified-signatures
    def LMSGetValue(element: CMIElementCoreEntry): CMIVocabularyEntry = js.native
    /**
      * This corresponds to the SCO exit point passed to the LMS system the last time the student experienced the SCO. This provides one mechanism to let the student return to a SCO at the same place
      * he left it earlier. In other words, this element can identify the student's exit point and that exit point can be used by the SCO as an entry point the next time the student runs the SCO.
      */
    // tslint:disable-next-line:unified-signatures
    def LMSGetValue(element: CMIElementCoreLessonLocation): CMIString255 = js.native
    /**
      * Identifies the SCO behavior desired after launch. Many SCOs have a single "behavior". Some SCOs, however, can present different amounts of information, or present information in different
      * sequences, or present information reflecting  different training philosophies based on an instructor's or designer's decisions. Designers may enable SCOs to behave in a virtually unlimited
      * number of ways. This standard supports the communication of three parameters that may result in different SCO behaviors.
      */
    // tslint:disable-next-line:unified-signatures
    def LMSGetValue(element: CMIElementCoreLessonMode): CMIVocabularyMode = js.native
    /**
      * This is the current student status as determined by the LMS system. Six status values are possible.
      */
    // tslint:disable-next-line:unified-signatures
    def LMSGetValue(element: CMIElementCoreLessonStatus): CMIVocabularyStatus = js.native
    /**
      * The _children keyword is used to determine all of the elements in the core category that are supported by the LMS. If an element has no children, but is supported, an empty string is returned.
      * If an element is not supported, an empty string is returned. A subsequent request for last error can verify that the element is not supported.
      */
    // tslint:disable-next-line:unified-signatures
    def LMSGetValue(element: CMIElementCoreScoreChildren): CMIString255 = js.native
    /**
      * The maximum score or total number that the student could have achieved.
      *
      * The cmi.core.score.max must be a normalized value between 0 and 100.
      */
    // tslint:disable-next-line:unified-signatures
    def LMSGetValue(element: CMIElementCoreScoreMax): CMIDecimal | CMIBlank = js.native
    /**
      * The minimum score that the student could have achieved.
      *
      * The cmi.core.score.min must be a normalized value between 0 and 100.
      */
    // tslint:disable-next-line:unified-signatures
    def LMSGetValue(element: CMIElementCoreScoreMin): CMIDecimal | CMIBlank = js.native
    /**
      * Indication of the performance of the student during his last attempt on the SCO. This score may be determined and calculated in any manner that makes sense to the SCO designer. For instance,
      * it could reflect the percentage of objectives complete, it could be the raw score on a multiple choice test, or it could indicate the number of correct first responses to embedded questions in
      * a SCO.
      *
      * The cmi.core.score.raw must be a normalized value between 0 and 100.
      */
    // tslint:disable-next-line:unified-signatures
    def LMSGetValue(element: CMIElementCoreScoreRaw): CMIDecimal | CMIBlank = js.native
    /**
      * Unique alpha-numeric code / identifier that refers to a single user of the LMS system.
      */
    // tslint:disable-next-line:unified-signatures
    def LMSGetValue(element: CMIElementCoreStudentId): CMIIdentifier = js.native
    /**
      * Normally, the official name used for the student on the course roster. A complete name, not just a first name.
      */
    // tslint:disable-next-line:unified-signatures
    def LMSGetValue(element: CMIElementCoreStudentName): CMIString255 = js.native
    /**
      * Accumulated time of all the student's sessions in the SCO.
      */
    // tslint:disable-next-line:unified-signatures
    def LMSGetValue(element: CMIElementCoreTotalTime): CMITimeSpan = js.native
    /**
      * The _children keyword is used to determine all of the elements in the core category that are supported by the LMS. If an element has no children, but is supported, an empty string is returned.
      * If an element is not supported, an empty string is returned. A subsequent request for last error can verify that the element is not supported.
      */
    // tslint:disable-next-line:unified-signatures
    def LMSGetValue(element: CMIElementInteractionsChildren): CMIString255 = js.native
    /**
      * The _count keyword is used to determine the current number of records in the cmi.interactions list. The total number of entries is returned. If the SCO does not know the count of the
      * cmi.interactions records, it can begin the current student count with 0. This would overwrite any information about interactions currently stored in the first index position. Overwriting or
      * appending is a decision that is made by the SCO author when he/she creates the SCO.
      */
    // tslint:disable-next-line:unified-signatures
    def LMSGetValue(element: CMIElementInteractionsCount): CMIInteger = js.native
    /**
      * Unique information generated at the SCO's creation that is needed for every use. Without this information, a SCO may not execute.
      */
    // tslint:disable-next-line:unified-signatures
    def LMSGetValue(element: CMIElementLaunchData): CMIString4096 = js.native
    /**
      * The _children keyword is used to determine all of the elements in the core category that are supported by the LMS. If an element has no children, but is supported, an empty string is returned.
      * If an element is not supported, an empty string is returned. A subsequent request for last error can verify that the element is not supported.
      */
    // tslint:disable-next-line:unified-signatures
    def LMSGetValue(element: CMIElementObjectivesChildren): CMIString255 = js.native
    /**
      * The _count keyword is used to determine the current number of records in the cmi.objectives list. The total number of entries is returned. If the SCO does not know the count of the
      * cmi.objectives records, it can begin the current student count with 0. This would overwrite any information about objectives currently stored in the first index position. Overwriting or
      * appending is a decision that is made by the SCO author when he/she creates the SCO.
      */
    // tslint:disable-next-line:unified-signatures
    def LMSGetValue(element: CMIElementObjectivesCount): CMIInteger = js.native
    /**
      * The _children keyword is used to determine all of the elements in the core category that are supported by the LMS. If an element has no children, but is supported, an empty string is returned.
      * If an element is not supported, an empty string is returned. A subsequent request for last error can verify that the element is not supported.
      */
    // tslint:disable-next-line:unified-signatures
    def LMSGetValue(element: CMIElementStudentDataChildren): CMIString255 = js.native
    /**
      * The passing score, as determined outside the SCO. When the SCO score is greater than or equal to the mastery score, the student is considered to have passed, or mastered the content. In some
      * cases, the SCO does not know what this passing score is, because it is determined by the LMS system.
      */
    // tslint:disable-next-line:unified-signatures
    def LMSGetValue(element: CMIElementStudentDataMasteryScore): CMIDecimal = js.native
    /**
      * The amount of time the student is allowed to have in the current attempt on the SCO. See time_limit_action for the SCO's expected response to exceeding the limit.
      */
    // tslint:disable-next-line:unified-signatures
    def LMSGetValue(element: CMIElementStudentDataMaxTimeAllowed): CMITimeSpan = js.native
    /**
      * Tells the SCO what to do when the max_time_allowed is exceeded. There iare two arguments for this element:
      *
      * - What the SCO should do - exit or continue
      * - What the student should see - message or no message
      */
    // tslint:disable-next-line:unified-signatures
    def LMSGetValue(element: CMIElementStudentDataTimeLimitAction): CMIVocabularyTimeLimitAction = js.native
    /**
      * Audio may be turned off, or its volume controlled. The element indicates whether the audio is turned off, or on.
      */
    // tslint:disable-next-line:unified-signatures
    def LMSGetValue(element: CMIElementStudentPreferenceAudio): CMISInteger = js.native
    /**
      * The _children keyword is used to determine all of the elements in the core category that are supported by the LMS. If an element has no children, but is supported, an empty string is returned.
      * If an element is not supported, an empty string is returned. A subsequent request for last error can verify that the element is not supported.
      */
    // tslint:disable-next-line:unified-signatures
    def LMSGetValue(element: CMIElementStudentPreferenceChildren): CMIString255 = js.native
    /**
      * For SCOs with multi-lingual capability, this element should be used to identify in what language the information should be delivered.
      */
    // tslint:disable-next-line:unified-signatures
    def LMSGetValue(element: CMIElementStudentPreferenceLanguage): CMIString255 = js.native
    /**
      * SCOs may sometimes be difficult to understand because of the pace. This element controls the pace of the content delivery.
      */
    // tslint:disable-next-line:unified-signatures
    def LMSGetValue(element: CMIElementStudentPreferenceSpeed): CMISInteger = js.native
    /**
      * In a SCO designed for audio, it may be possible to turn off the audio, and view the audio content in a text window. Or it may be possible to leave the audio on, and request that the text be
      * presented simultaneously with the audio. Or it may be possible to make the text disappear so that only the audio and the screen graphics are available. This element defines whether the audio
      * text appears in the SCO.
      */
    // tslint:disable-next-line:unified-signatures
    def LMSGetValue(element: CMIElementStudentPreferenceText): CMISInteger = js.native
    /**
      * Unique information generated by the SCO during previous uses that is needed for the current use. This unique information is applicable to a launching SCO. Normally this is the element used
      * by the SCO for restart information. This is normally data that is created by the SCO and stored by the LMS to pass back to the SCO the next time the SCO is run.
      *
      * The LMS must set aside a space for this group for each SCO for each student. It stores this data and returns it to the SCO when it is run again. The LMS shall retain this data as long as the
      * student is in the course.
      */
    // tslint:disable-next-line:unified-signatures
    def LMSGetValue(element: CMIElementSuspendData): CMIString4096 = js.native
    /**
      * The _version keyword is used to determine the version of the data model supported by the LMS.
      */
    // tslint:disable-next-line:unified-signatures
    def LMSGetValue(element: CMIElementVersion): CMIString255 = js.native
    /**
      * An internally, developer defined, SCO specific identifier for an objective.
      */
    // tslint:disable-next-line:unified-signatures
    @JSName("LMSGetValue")
    def LMSGetValue_CMIIdentifier(element: CMIElementObjectivesNID): CMIIdentifier = js.native
    /**
      * The _children keyword is used to determine all of the elements in the core category that are supported by the LMS. If an element has no children, but is supported, an empty string is returned.
      * If an element is not supported, an empty string is returned. A subsequent request for last error can verify that the element is not supported.
      */
    // tslint:disable-next-line:unified-signatures
    @JSName("LMSGetValue")
    def LMSGetValue_CMIString255(element: CMIElementObjectivesNScoreChildren): CMIString255 = js.native
    /**
      * The status of the SCO's objective obtained by the student after each attempt to master the SCO's objective. Only 6 possible vocabulary values: passed, completed, failed, incomplete, not
      * attempted or browsed.
      */
    // tslint:disable-next-line:unified-signatures
    @JSName("LMSGetValue")
    def LMSGetValue_CMIVocabularyStatus(element: CMIElementObjectivesNStatus): CMIVocabularyStatus = js.native
    /**
      * Numerical representation of student performance after each attempt on the objective. May be unprocessed raw score.
      *
      * The cmi.objectives.n.score.raw must be a normalized value between 0 and 100.
      */
    // tslint:disable-next-line:unified-signatures
    /**
      * The maximum score or total number that the student could have achieved on the objective.
      *
      * The cmi.objectives.n.score.max must be a normalized value between 0 and 100.
      */
    /**
      * The minimum score that the student could have achieved on the objective.
      *
      * The cmi.objectives.n.score.min must be a normalized value between 0 and 100.
      */
    @JSName("LMSGetValue")
    def LMSGetValue_Union(
      element: CMIElementObjectivesNScoreMax | CMIElementObjectivesNScoreMin | CMIElementObjectivesNScoreRaw
    ): CMIDecimal | CMIBlank = js.native
    
    // Execution State
    /**
      * Begins a communication session with the LMS.
      * @param param The “” parameter is required by all SCORM methods that don’t accept any other arguments.
      */
    def LMSInitialize(param: CMIBlank): CMIBoolean = js.native
    
    /**
      * Description of possible student responses to the interaction. There may be more than one correct response, and some responses may be more correct than others.
      */
    // tslint:disable-next-line:unified-signatures
    /**
      * Description of possible responses to the interaction. There may be more than one correct response, and some responses may be more correct than others.
      */
    /**
      * How the system judges the described response.
      */
    def LMSSetValue(
      element: CMIElementInteractionsNCorrectResponsesNPattern | CMIElementInteractionsNResult | CMIElementInteractionsNStudentResponse,
      value: CMIFeedback | CMIVocabularyResult
    ): CMIBoolean = js.native
    /**
      * An internally, developer defined, SCO specific identifier for an objective.
      */
    // tslint:disable-next-line:unified-signatures
    /**
      * Numerical representation of student performance after each attempt on the objective. May be unprocessed raw score.
      *
      * The cmi.objectives.n.score.raw must be a normalized value between 0 and 100.
      */
    /**
      * The maximum score or total number that the student could have achieved on the objective.
      *
      * The cmi.objectives.n.score.max must be a normalized value between 0 and 100.
      */
    /**
      * The minimum score that the student could have achieved on the objective.
      *
      * The cmi.objectives.n.score.min must be a normalized value between 0 and 100.
      */
    /**
      * Unique identifier for an interaction.
      */
    /**
      * Identification of when the student interaction was completed.
      */
    /**
      * Interactions vary in importance. The weighting is a factor which is used to identify the relative importance of one interaction compared to another. For instance, if the first interaction has
      * a weight of 15 and the second interaction has a weight of 25, then any combined score that reflects weighting would be more influenced by the second interaction.
      *
      * If all interactions are equal in importance, then each interaction has the same weight.
      *
      * A weight of 0 indicates that the interaction should not be counted in the weighted final score.
      */
    /**
      * The time from the presentation of the stimulus to the completion of the measurable response.
      */
    def LMSSetValue(
      element: CMIElementInteractionsNID | CMIElementInteractionsNLatency | CMIElementInteractionsNTime | CMIElementInteractionsNWeighting | CMIElementObjectivesNID | CMIElementObjectivesNScoreMax | CMIElementObjectivesNScoreMin | CMIElementObjectivesNScoreRaw,
      value: CMIDecimal | CMIIdentifier | CMITime | CMITimeSpan
    ): CMIBoolean = js.native
    def LMSSetValue(
      element: CMIElementObjectivesNScoreMax | CMIElementObjectivesNScoreMin | CMIElementObjectivesNScoreRaw,
      value: CMIBlank
    ): CMIBoolean = js.native
    /**
      * Freeform feedback from the SCO. For example, the student may have the option of leaving comments at any point in the SCO, or they may be asked for comments at the end of the SCO. The comment
      * may also have an indication of where or when in the SCO it was created. A location may be tagged and embedded in the comment.
      */
    // tslint:disable-next-line:unified-signatures
    def LMSSetValue(element: CMIElementComments, value: CMIString4096): CMIBoolean = js.native
    /**
      * An indication of how or why the student has left the SCO.
      */
    // tslint:disable-next-line:unified-signatures
    def LMSSetValue(element: CMIElementCoreExit, value: CMIVocabularyExit): CMIBoolean = js.native
    /**
      * This corresponds to the SCO exit point passed to the LMS system the last time the student experienced the SCO. This provides one mechanism to let the student return to a SCO at the same place
      * he left it earlier. In other words, this element can identify the student's exit point and that exit point can be used by the SCO as an entry point the next time the student runs the SCO.
      */
    // tslint:disable-next-line:unified-signatures
    def LMSSetValue(element: CMIElementCoreLessonLocation, value: CMIString255): CMIBoolean = js.native
    /**
      * This is the current student status as determined by the LMS system. Six status values are possible.
      */
    // tslint:disable-next-line:unified-signatures
    def LMSSetValue(element: CMIElementCoreLessonStatus, value: CMIVocabularyStatus): CMIBoolean = js.native
    def LMSSetValue(element: CMIElementCoreScoreMax, value: CMIBlank): CMIBoolean = js.native
    /**
      * The maximum score or total number that the student could have achieved.
      *
      * The cmi.core.score.max must be a normalized value between 0 and 100.
      */
    // tslint:disable-next-line:unified-signatures
    def LMSSetValue(element: CMIElementCoreScoreMax, value: CMIDecimal): CMIBoolean = js.native
    def LMSSetValue(element: CMIElementCoreScoreMin, value: CMIBlank): CMIBoolean = js.native
    /**
      * The minimum score that the student could have achieved.
      *
      * The cmi.core.score.min must be a normalized value between 0 and 100.
      */
    // tslint:disable-next-line:unified-signatures
    def LMSSetValue(element: CMIElementCoreScoreMin, value: CMIDecimal): CMIBoolean = js.native
    def LMSSetValue(element: CMIElementCoreScoreRaw, value: CMIBlank): CMIBoolean = js.native
    /**
      * Indication of the performance of the student during his last attempt on the SCO. This score may be determined and calculated in any manner that makes sense to the SCO designer. For instance,
      * it could reflect the percentage of objectives complete, it could be the raw score on a multiple choice test, or it could indicate the number of correct first responses to embedded questions in
      * a SCO.
      *
      * The cmi.core.score.raw must be a normalized value between 0 and 100.
      */
    // tslint:disable-next-line:unified-signatures
    def LMSSetValue(element: CMIElementCoreScoreRaw, value: CMIDecimal): CMIBoolean = js.native
    /**
      * This is the amount of time in hours, minutes and seconds that the student has spent in the SCO at the time they leave it. That is, this represents the time from beginning of the session to the
      * end of a single use of the SCO.
      */
    // tslint:disable-next-line:unified-signatures
    def LMSSetValue(element: CMIElementCoreSessionTime, value: CMITimeSpan): CMIBoolean = js.native
    /**
      * Indication of which category of interaction is recorded. The type of interction determines how the interaction response should be interpreted. Eight possible question types are defined. They
      * are not meant to be limiting. There are other types of questions. However, if one of these eight types is used, these are the identifiers that match those types.
      */
    // tslint:disable-next-line:unified-signatures
    def LMSSetValue(element: CMIElementInteractionsNType, value: CMIVocabularyInteraction): CMIBoolean = js.native
    /**
      * The status of the SCO's objective obtained by the student after each attempt to master the SCO's objective. Only 6 possible vocabulary values: passed, completed, failed, incomplete, not
      * attempted or browsed.
      */
    // tslint:disable-next-line:unified-signatures
    def LMSSetValue(element: CMIElementObjectivesNStatus, value: CMIVocabularyStatus): CMIBoolean = js.native
    /**
      * Audio may be turned off, or its volume controlled. The element indicates whether the audio is turned off, or on.
      */
    // tslint:disable-next-line:unified-signatures
    def LMSSetValue(element: CMIElementStudentPreferenceAudio, value: CMISInteger): CMIBoolean = js.native
    /**
      * For SCOs with multi-lingual capability, this element should be used to identify in what language the information should be delivered.
      */
    // tslint:disable-next-line:unified-signatures
    def LMSSetValue(element: CMIElementStudentPreferenceLanguage, value: CMIString255): CMIBoolean = js.native
    /**
      * SCOs may sometimes be difficult to understand because of the pace. This element controls the pace of the content delivery.
      */
    // tslint:disable-next-line:unified-signatures
    def LMSSetValue(element: CMIElementStudentPreferenceSpeed, value: CMISInteger): CMIBoolean = js.native
    /**
      * In a SCO designed for audio, it may be possible to turn off the audio, and view the audio content in a text window. Or it may be possible to leave the audio on, and request that the text be
      * presented simultaneously with the audio. Or it may be possible to make the text disappear so that only the audio and the screen graphics are available. This element defines whether the audio
      * text appears in the SCO.
      */
    // tslint:disable-next-line:unified-signatures
    def LMSSetValue(element: CMIElementStudentPreferenceText, value: CMISInteger): CMIBoolean = js.native
    /**
      * Unique information generated by the SCO during previous uses that is needed for the current use. This unique information is applicable to a launching SCO. Normally this is the element used by
      * the SCO for restart information. This is normally data that is created by the SCO and stored by the LMS to pass back to the SCO the next time the SCO is run.
      *
      * The LMS must set aside a space for this group for each SCO for each student. It stores this data and returns it to the SCO when it is run again. The LMS shall retain this data as long as the
      * student is in the course.
      */
    // tslint:disable-next-line:unified-signatures
    def LMSSetValue(element: CMIElementSuspendData, value: CMIString4096): CMIBoolean = js.native
  }
}
