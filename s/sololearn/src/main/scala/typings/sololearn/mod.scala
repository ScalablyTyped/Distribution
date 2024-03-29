package typings.sololearn

import org.scalablytyped.runtime.StringDictionary
import typings.sololearn.sololearnStrings._empty
import typings.sololearn.sololearnStrings.c_
import typings.sololearn.sololearnStrings.php_
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sololearn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCode(id: String): js.Promise[Code] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCode")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Code]]
  
  inline def getLeaderboard(): js.Promise[js.Array[Leader]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLeaderboard")().asInstanceOf[js.Promise[js.Array[Leader]]]
  inline def getLeaderboard(lang: String): js.Promise[js.Array[Leader]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLeaderboard")(lang.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Leader]]]
  
  inline def getQuestion(id: Double): js.Promise[Question] = ^.asInstanceOf[js.Dynamic].applyDynamic("getQuestion")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Question]]
  
  inline def getUser(id: Double): js.Promise[User] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUser")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[User]]
  
  inline def searchCodes(): js.Promise[js.Array[Code]] = ^.asInstanceOf[js.Dynamic].applyDynamic("searchCodes")().asInstanceOf[js.Promise[js.Array[Code]]]
  inline def searchCodes(searchQuery: String): js.Promise[js.Array[Code]] = ^.asInstanceOf[js.Dynamic].applyDynamic("searchCodes")(searchQuery.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Code]]]
  inline def searchCodes(searchQuery: String, order: Unit, language: Unit, page: Double): js.Promise[js.Array[Code]] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchCodes")(searchQuery.asInstanceOf[js.Any], order.asInstanceOf[js.Any], language.asInstanceOf[js.Any], page.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Code]]]
  inline def searchCodes(searchQuery: String, order: Unit, language: CodeLanguage): js.Promise[js.Array[Code]] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchCodes")(searchQuery.asInstanceOf[js.Any], order.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Code]]]
  inline def searchCodes(searchQuery: String, order: Unit, language: CodeLanguage, page: Double): js.Promise[js.Array[Code]] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchCodes")(searchQuery.asInstanceOf[js.Any], order.asInstanceOf[js.Any], language.asInstanceOf[js.Any], page.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Code]]]
  inline def searchCodes(searchQuery: String, order: Unit, language: _empty): js.Promise[js.Array[Code]] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchCodes")(searchQuery.asInstanceOf[js.Any], order.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Code]]]
  inline def searchCodes(searchQuery: String, order: Unit, language: _empty, page: Double): js.Promise[js.Array[Code]] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchCodes")(searchQuery.asInstanceOf[js.Any], order.asInstanceOf[js.Any], language.asInstanceOf[js.Any], page.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Code]]]
  inline def searchCodes(searchQuery: String, order: CodeOrder): js.Promise[js.Array[Code]] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchCodes")(searchQuery.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Code]]]
  inline def searchCodes(searchQuery: String, order: CodeOrder, language: Unit, page: Double): js.Promise[js.Array[Code]] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchCodes")(searchQuery.asInstanceOf[js.Any], order.asInstanceOf[js.Any], language.asInstanceOf[js.Any], page.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Code]]]
  inline def searchCodes(searchQuery: String, order: CodeOrder, language: CodeLanguage): js.Promise[js.Array[Code]] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchCodes")(searchQuery.asInstanceOf[js.Any], order.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Code]]]
  inline def searchCodes(searchQuery: String, order: CodeOrder, language: CodeLanguage, page: Double): js.Promise[js.Array[Code]] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchCodes")(searchQuery.asInstanceOf[js.Any], order.asInstanceOf[js.Any], language.asInstanceOf[js.Any], page.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Code]]]
  inline def searchCodes(searchQuery: String, order: CodeOrder, language: _empty): js.Promise[js.Array[Code]] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchCodes")(searchQuery.asInstanceOf[js.Any], order.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Code]]]
  inline def searchCodes(searchQuery: String, order: CodeOrder, language: _empty, page: Double): js.Promise[js.Array[Code]] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchCodes")(searchQuery.asInstanceOf[js.Any], order.asInstanceOf[js.Any], language.asInstanceOf[js.Any], page.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Code]]]
  inline def searchCodes(searchQuery: Unit, order: Unit, language: Unit, page: Double): js.Promise[js.Array[Code]] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchCodes")(searchQuery.asInstanceOf[js.Any], order.asInstanceOf[js.Any], language.asInstanceOf[js.Any], page.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Code]]]
  inline def searchCodes(searchQuery: Unit, order: Unit, language: CodeLanguage): js.Promise[js.Array[Code]] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchCodes")(searchQuery.asInstanceOf[js.Any], order.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Code]]]
  inline def searchCodes(searchQuery: Unit, order: Unit, language: CodeLanguage, page: Double): js.Promise[js.Array[Code]] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchCodes")(searchQuery.asInstanceOf[js.Any], order.asInstanceOf[js.Any], language.asInstanceOf[js.Any], page.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Code]]]
  inline def searchCodes(searchQuery: Unit, order: Unit, language: _empty): js.Promise[js.Array[Code]] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchCodes")(searchQuery.asInstanceOf[js.Any], order.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Code]]]
  inline def searchCodes(searchQuery: Unit, order: Unit, language: _empty, page: Double): js.Promise[js.Array[Code]] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchCodes")(searchQuery.asInstanceOf[js.Any], order.asInstanceOf[js.Any], language.asInstanceOf[js.Any], page.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Code]]]
  inline def searchCodes(searchQuery: Unit, order: CodeOrder): js.Promise[js.Array[Code]] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchCodes")(searchQuery.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Code]]]
  inline def searchCodes(searchQuery: Unit, order: CodeOrder, language: Unit, page: Double): js.Promise[js.Array[Code]] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchCodes")(searchQuery.asInstanceOf[js.Any], order.asInstanceOf[js.Any], language.asInstanceOf[js.Any], page.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Code]]]
  inline def searchCodes(searchQuery: Unit, order: CodeOrder, language: CodeLanguage): js.Promise[js.Array[Code]] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchCodes")(searchQuery.asInstanceOf[js.Any], order.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Code]]]
  inline def searchCodes(searchQuery: Unit, order: CodeOrder, language: CodeLanguage, page: Double): js.Promise[js.Array[Code]] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchCodes")(searchQuery.asInstanceOf[js.Any], order.asInstanceOf[js.Any], language.asInstanceOf[js.Any], page.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Code]]]
  inline def searchCodes(searchQuery: Unit, order: CodeOrder, language: _empty): js.Promise[js.Array[Code]] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchCodes")(searchQuery.asInstanceOf[js.Any], order.asInstanceOf[js.Any], language.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Code]]]
  inline def searchCodes(searchQuery: Unit, order: CodeOrder, language: _empty, page: Double): js.Promise[js.Array[Code]] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchCodes")(searchQuery.asInstanceOf[js.Any], order.asInstanceOf[js.Any], language.asInstanceOf[js.Any], page.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Code]]]
  
  inline def searchQuestions(): js.Promise[js.Array[Question]] = ^.asInstanceOf[js.Dynamic].applyDynamic("searchQuestions")().asInstanceOf[js.Promise[js.Array[Question]]]
  inline def searchQuestions(searchQuery: String): js.Promise[js.Array[Question]] = ^.asInstanceOf[js.Dynamic].applyDynamic("searchQuestions")(searchQuery.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[Question]]]
  inline def searchQuestions(searchQuery: String, order: Unit, page: Double): js.Promise[js.Array[Question]] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchQuestions")(searchQuery.asInstanceOf[js.Any], order.asInstanceOf[js.Any], page.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Question]]]
  inline def searchQuestions(searchQuery: String, order: QuestionOrder): js.Promise[js.Array[Question]] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchQuestions")(searchQuery.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Question]]]
  inline def searchQuestions(searchQuery: String, order: QuestionOrder, page: Double): js.Promise[js.Array[Question]] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchQuestions")(searchQuery.asInstanceOf[js.Any], order.asInstanceOf[js.Any], page.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Question]]]
  inline def searchQuestions(searchQuery: Unit, order: Unit, page: Double): js.Promise[js.Array[Question]] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchQuestions")(searchQuery.asInstanceOf[js.Any], order.asInstanceOf[js.Any], page.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Question]]]
  inline def searchQuestions(searchQuery: Unit, order: QuestionOrder): js.Promise[js.Array[Question]] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchQuestions")(searchQuery.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Question]]]
  inline def searchQuestions(searchQuery: Unit, order: QuestionOrder, page: Double): js.Promise[js.Array[Question]] = (^.asInstanceOf[js.Dynamic].applyDynamic("searchQuestions")(searchQuery.asInstanceOf[js.Any], order.asInstanceOf[js.Any], page.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Question]]]
  
  trait Answer extends StObject {
    
    /** The author's SoloLearn ID */
    var author: Double
    
    /** The content of the answer */
    var content: String
    
    /** The date the answer was written */
    var date: Date
    
    /** The amount of upvotes the answer has */
    var upvotes: Double
  }
  object Answer {
    
    inline def apply(author: Double, content: String, date: Date, upvotes: Double): Answer = {
      val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], upvotes = upvotes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Answer]
    }
    
    extension [Self <: Answer](x: Self) {
      
      inline def setAuthor(value: Double): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setUpvotes(value: Double): Self = StObject.set(x, "upvotes", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.sololearn.sololearnStrings.Achiever
    - typings.sololearn.sololearnStrings.Answerer
    - typings.sololearn.sololearnStrings.Asker
    - typings.sololearn.sololearnStrings.`BTS Streak Finisher`
    - typings.sololearn.sololearnStrings.`Certified Tester`
    - typings.sololearn.sololearnStrings.`Challenge Master`
    - typings.sololearn.sololearnStrings.`Code Master`
    - typings.sololearn.sololearnStrings.`Code Ninja`
    - typings.sololearn.sololearnStrings.Coder
    - typings.sololearn.sololearnStrings.`Comment Master`
    - typings.sololearn.sololearnStrings.Contributor
    - typings.sololearn.sololearnStrings.`Course Master`
    - typings.sololearn.sololearnStrings.Creator
    - typings.sololearn.sololearnStrings.`Creator Master`
    - typings.sololearn.sololearnStrings.Developer
    - typings.sololearn.sololearnStrings.`Engaged inExclamationmark`
    - typings.sololearn.sololearnStrings.EpicExclamationmark
    - typings.sololearn.sololearnStrings.freeCodeCamp
    - typings.sololearn.sololearnStrings.`Gaining Experience`
    - typings.sololearn.sololearnStrings.`Gold Moderator`
    - typings.sololearn.sololearnStrings.`Gold Quiz Reviewer`
    - typings.sololearn.sololearnStrings.`Good Answer`
    - typings.sololearn.sololearnStrings.`Good Citizen`
    - typings.sololearn.sololearnStrings.`Good Question`
    - typings.sololearn.sololearnStrings.`Great Answer`
    - typings.sololearn.sololearnStrings.`Great Question`
    - typings.sololearn.sololearnStrings.Guru
    - typings.sololearn.sololearnStrings.`Hat Trick`
    - typings.sololearn.sololearnStrings.Illuminator
    - typings.sololearn.sololearnStrings.Intern
    - typings.sololearn.sololearnStrings.Junior
    - typings.sololearn.sololearnStrings.`Just Getting Started`
    - typings.sololearn.sololearnStrings.Master
    - typings.sololearn.sololearnStrings.Moderator
    - typings.sololearn.sololearnStrings.Networker
    - typings.sololearn.sololearnStrings.`On Your Way to Fame`
    - typings.sololearn.sololearnStrings.`Platinum Moderator`
    - typings.sololearn.sololearnStrings.`Popular Answer`
    - typings.sololearn.sololearnStrings.`Popular Question`
    - typings.sololearn.sololearnStrings.`Practice Makes Perfect`
    - typings.sololearn.sololearnStrings.`Question Guru`
    - typings.sololearn.sololearnStrings.`Question Master`
    - typings.sololearn.sololearnStrings.`Question Ninja`
    - typings.sololearn.sololearnStrings.`Quiz Creator`
    - typings.sololearn.sololearnStrings.`Quiz Creator Master`
    - typings.sololearn.sololearnStrings.`Quiz Reviewer`
    - typings.sololearn.sololearnStrings.RespectExclamationmark
    - typings.sololearn.sololearnStrings.`Respected Citizen`
    - typings.sololearn.sololearnStrings.`Rising Star`
    - typings.sololearn.sololearnStrings.`Self-Learner`
    - typings.sololearn.sololearnStrings.`Senior Developer`
    - typings.sololearn.sololearnStrings.`Solution Guru`
    - typings.sololearn.sololearnStrings.`Solution Master`
    - typings.sololearn.sololearnStrings.`Solution Ninja`
    - typings.sololearn.sololearnStrings.Solver
    - typings.sololearn.sololearnStrings.Teacher
    - typings.sololearn.sololearnStrings.`The Player`
    - typings.sololearn.sololearnStrings.`Top Answer`
    - typings.sololearn.sololearnStrings.`Top Question`
    - typings.sololearn.sololearnStrings.UnbeatableExclamationmark
    - typings.sololearn.sololearnStrings.Unstoppable
    - typings.sololearn.sololearnStrings.`Verified Account`
  */
  trait Badge extends StObject
  object Badge {
    
    inline def Achiever: typings.sololearn.sololearnStrings.Achiever = "Achiever".asInstanceOf[typings.sololearn.sololearnStrings.Achiever]
    
    inline def Answerer: typings.sololearn.sololearnStrings.Answerer = "Answerer".asInstanceOf[typings.sololearn.sololearnStrings.Answerer]
    
    inline def Asker: typings.sololearn.sololearnStrings.Asker = "Asker".asInstanceOf[typings.sololearn.sololearnStrings.Asker]
    
    inline def `BTS Streak Finisher`: typings.sololearn.sololearnStrings.`BTS Streak Finisher` = ("BTS Streak Finisher").asInstanceOf[typings.sololearn.sololearnStrings.`BTS Streak Finisher`]
    
    inline def `Certified Tester`: typings.sololearn.sololearnStrings.`Certified Tester` = ("Certified Tester").asInstanceOf[typings.sololearn.sololearnStrings.`Certified Tester`]
    
    inline def `Challenge Master`: typings.sololearn.sololearnStrings.`Challenge Master` = ("Challenge Master").asInstanceOf[typings.sololearn.sololearnStrings.`Challenge Master`]
    
    inline def `Code Master`: typings.sololearn.sololearnStrings.`Code Master` = ("Code Master").asInstanceOf[typings.sololearn.sololearnStrings.`Code Master`]
    
    inline def `Code Ninja`: typings.sololearn.sololearnStrings.`Code Ninja` = ("Code Ninja").asInstanceOf[typings.sololearn.sololearnStrings.`Code Ninja`]
    
    inline def Coder: typings.sololearn.sololearnStrings.Coder = "Coder".asInstanceOf[typings.sololearn.sololearnStrings.Coder]
    
    inline def `Comment Master`: typings.sololearn.sololearnStrings.`Comment Master` = ("Comment Master").asInstanceOf[typings.sololearn.sololearnStrings.`Comment Master`]
    
    inline def Contributor: typings.sololearn.sololearnStrings.Contributor = "Contributor".asInstanceOf[typings.sololearn.sololearnStrings.Contributor]
    
    inline def `Course Master`: typings.sololearn.sololearnStrings.`Course Master` = ("Course Master").asInstanceOf[typings.sololearn.sololearnStrings.`Course Master`]
    
    inline def Creator: typings.sololearn.sololearnStrings.Creator = "Creator".asInstanceOf[typings.sololearn.sololearnStrings.Creator]
    
    inline def `Creator Master`: typings.sololearn.sololearnStrings.`Creator Master` = ("Creator Master").asInstanceOf[typings.sololearn.sololearnStrings.`Creator Master`]
    
    inline def Developer: typings.sololearn.sololearnStrings.Developer = "Developer".asInstanceOf[typings.sololearn.sololearnStrings.Developer]
    
    inline def `Engaged inExclamationmark`: typings.sololearn.sololearnStrings.`Engaged inExclamationmark` = ("Engaged in!").asInstanceOf[typings.sololearn.sololearnStrings.`Engaged inExclamationmark`]
    
    inline def EpicExclamationmark: typings.sololearn.sololearnStrings.EpicExclamationmark = "Epic!".asInstanceOf[typings.sololearn.sololearnStrings.EpicExclamationmark]
    
    inline def `Gaining Experience`: typings.sololearn.sololearnStrings.`Gaining Experience` = ("Gaining Experience").asInstanceOf[typings.sololearn.sololearnStrings.`Gaining Experience`]
    
    inline def `Gold Moderator`: typings.sololearn.sololearnStrings.`Gold Moderator` = ("Gold Moderator").asInstanceOf[typings.sololearn.sololearnStrings.`Gold Moderator`]
    
    inline def `Gold Quiz Reviewer`: typings.sololearn.sololearnStrings.`Gold Quiz Reviewer` = ("Gold Quiz Reviewer").asInstanceOf[typings.sololearn.sololearnStrings.`Gold Quiz Reviewer`]
    
    inline def `Good Answer`: typings.sololearn.sololearnStrings.`Good Answer` = ("Good Answer").asInstanceOf[typings.sololearn.sololearnStrings.`Good Answer`]
    
    inline def `Good Citizen`: typings.sololearn.sololearnStrings.`Good Citizen` = ("Good Citizen").asInstanceOf[typings.sololearn.sololearnStrings.`Good Citizen`]
    
    inline def `Good Question`: typings.sololearn.sololearnStrings.`Good Question` = ("Good Question").asInstanceOf[typings.sololearn.sololearnStrings.`Good Question`]
    
    inline def `Great Answer`: typings.sololearn.sololearnStrings.`Great Answer` = ("Great Answer").asInstanceOf[typings.sololearn.sololearnStrings.`Great Answer`]
    
    inline def `Great Question`: typings.sololearn.sololearnStrings.`Great Question` = ("Great Question").asInstanceOf[typings.sololearn.sololearnStrings.`Great Question`]
    
    inline def Guru: typings.sololearn.sololearnStrings.Guru = "Guru".asInstanceOf[typings.sololearn.sololearnStrings.Guru]
    
    inline def `Hat Trick`: typings.sololearn.sololearnStrings.`Hat Trick` = ("Hat Trick").asInstanceOf[typings.sololearn.sololearnStrings.`Hat Trick`]
    
    inline def Illuminator: typings.sololearn.sololearnStrings.Illuminator = "Illuminator".asInstanceOf[typings.sololearn.sololearnStrings.Illuminator]
    
    inline def Intern: typings.sololearn.sololearnStrings.Intern = "Intern".asInstanceOf[typings.sololearn.sololearnStrings.Intern]
    
    inline def Junior: typings.sololearn.sololearnStrings.Junior = "Junior".asInstanceOf[typings.sololearn.sololearnStrings.Junior]
    
    inline def `Just Getting Started`: typings.sololearn.sololearnStrings.`Just Getting Started` = ("Just Getting Started").asInstanceOf[typings.sololearn.sololearnStrings.`Just Getting Started`]
    
    inline def Master: typings.sololearn.sololearnStrings.Master = "Master".asInstanceOf[typings.sololearn.sololearnStrings.Master]
    
    inline def Moderator: typings.sololearn.sololearnStrings.Moderator = "Moderator".asInstanceOf[typings.sololearn.sololearnStrings.Moderator]
    
    inline def Networker: typings.sololearn.sololearnStrings.Networker = "Networker".asInstanceOf[typings.sololearn.sololearnStrings.Networker]
    
    inline def `On Your Way to Fame`: typings.sololearn.sololearnStrings.`On Your Way to Fame` = ("On Your Way to Fame").asInstanceOf[typings.sololearn.sololearnStrings.`On Your Way to Fame`]
    
    inline def `Platinum Moderator`: typings.sololearn.sololearnStrings.`Platinum Moderator` = ("Platinum Moderator").asInstanceOf[typings.sololearn.sololearnStrings.`Platinum Moderator`]
    
    inline def `Popular Answer`: typings.sololearn.sololearnStrings.`Popular Answer` = ("Popular Answer").asInstanceOf[typings.sololearn.sololearnStrings.`Popular Answer`]
    
    inline def `Popular Question`: typings.sololearn.sololearnStrings.`Popular Question` = ("Popular Question").asInstanceOf[typings.sololearn.sololearnStrings.`Popular Question`]
    
    inline def `Practice Makes Perfect`: typings.sololearn.sololearnStrings.`Practice Makes Perfect` = ("Practice Makes Perfect").asInstanceOf[typings.sololearn.sololearnStrings.`Practice Makes Perfect`]
    
    inline def `Question Guru`: typings.sololearn.sololearnStrings.`Question Guru` = ("Question Guru").asInstanceOf[typings.sololearn.sololearnStrings.`Question Guru`]
    
    inline def `Question Master`: typings.sololearn.sololearnStrings.`Question Master` = ("Question Master").asInstanceOf[typings.sololearn.sololearnStrings.`Question Master`]
    
    inline def `Question Ninja`: typings.sololearn.sololearnStrings.`Question Ninja` = ("Question Ninja").asInstanceOf[typings.sololearn.sololearnStrings.`Question Ninja`]
    
    inline def `Quiz Creator`: typings.sololearn.sololearnStrings.`Quiz Creator` = ("Quiz Creator").asInstanceOf[typings.sololearn.sololearnStrings.`Quiz Creator`]
    
    inline def `Quiz Creator Master`: typings.sololearn.sololearnStrings.`Quiz Creator Master` = ("Quiz Creator Master").asInstanceOf[typings.sololearn.sololearnStrings.`Quiz Creator Master`]
    
    inline def `Quiz Reviewer`: typings.sololearn.sololearnStrings.`Quiz Reviewer` = ("Quiz Reviewer").asInstanceOf[typings.sololearn.sololearnStrings.`Quiz Reviewer`]
    
    inline def RespectExclamationmark: typings.sololearn.sololearnStrings.RespectExclamationmark = "Respect!".asInstanceOf[typings.sololearn.sololearnStrings.RespectExclamationmark]
    
    inline def `Respected Citizen`: typings.sololearn.sololearnStrings.`Respected Citizen` = ("Respected Citizen").asInstanceOf[typings.sololearn.sololearnStrings.`Respected Citizen`]
    
    inline def `Rising Star`: typings.sololearn.sololearnStrings.`Rising Star` = ("Rising Star").asInstanceOf[typings.sololearn.sololearnStrings.`Rising Star`]
    
    inline def `Self-Learner`: typings.sololearn.sololearnStrings.`Self-Learner` = "Self-Learner".asInstanceOf[typings.sololearn.sololearnStrings.`Self-Learner`]
    
    inline def `Senior Developer`: typings.sololearn.sololearnStrings.`Senior Developer` = ("Senior Developer").asInstanceOf[typings.sololearn.sololearnStrings.`Senior Developer`]
    
    inline def `Solution Guru`: typings.sololearn.sololearnStrings.`Solution Guru` = ("Solution Guru").asInstanceOf[typings.sololearn.sololearnStrings.`Solution Guru`]
    
    inline def `Solution Master`: typings.sololearn.sololearnStrings.`Solution Master` = ("Solution Master").asInstanceOf[typings.sololearn.sololearnStrings.`Solution Master`]
    
    inline def `Solution Ninja`: typings.sololearn.sololearnStrings.`Solution Ninja` = ("Solution Ninja").asInstanceOf[typings.sololearn.sololearnStrings.`Solution Ninja`]
    
    inline def Solver: typings.sololearn.sololearnStrings.Solver = "Solver".asInstanceOf[typings.sololearn.sololearnStrings.Solver]
    
    inline def Teacher: typings.sololearn.sololearnStrings.Teacher = "Teacher".asInstanceOf[typings.sololearn.sololearnStrings.Teacher]
    
    inline def `The Player`: typings.sololearn.sololearnStrings.`The Player` = ("The Player").asInstanceOf[typings.sololearn.sololearnStrings.`The Player`]
    
    inline def `Top Answer`: typings.sololearn.sololearnStrings.`Top Answer` = ("Top Answer").asInstanceOf[typings.sololearn.sololearnStrings.`Top Answer`]
    
    inline def `Top Question`: typings.sololearn.sololearnStrings.`Top Question` = ("Top Question").asInstanceOf[typings.sololearn.sololearnStrings.`Top Question`]
    
    inline def UnbeatableExclamationmark: typings.sololearn.sololearnStrings.UnbeatableExclamationmark = "Unbeatable!".asInstanceOf[typings.sololearn.sololearnStrings.UnbeatableExclamationmark]
    
    inline def Unstoppable: typings.sololearn.sololearnStrings.Unstoppable = "Unstoppable".asInstanceOf[typings.sololearn.sololearnStrings.Unstoppable]
    
    inline def `Verified Account`: typings.sololearn.sololearnStrings.`Verified Account` = ("Verified Account").asInstanceOf[typings.sololearn.sololearnStrings.`Verified Account`]
    
    inline def freeCodeCamp: typings.sololearn.sololearnStrings.freeCodeCamp = "freeCodeCamp".asInstanceOf[typings.sololearn.sololearnStrings.freeCodeCamp]
  }
  
  trait Code extends StObject {
    
    /** The author's SoloLearn ID */
    var author: Double
    
    /** The code's ID */
    var id: String
    
    /** The language the code is written in */
    var language: CodeLanguage
    
    /** The date of the last modification made to the code, or `null` if it is unknown */
    var lastModified: Date | Null
    
    /** The name of the code */
    var name: String
    
    /** `true` if the code is public, `false` if it is private */
    var public: Boolean
    
    /** The amount of upvotes the code has */
    var upvotes: Double
  }
  object Code {
    
    inline def apply(author: Double, id: String, language: CodeLanguage, name: String, public: Boolean, upvotes: Double): Code = {
      val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any], upvotes = upvotes.asInstanceOf[js.Any], lastModified = null)
      __obj.asInstanceOf[Code]
    }
    
    extension [Self <: Code](x: Self) {
      
      inline def setAuthor(value: Double): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLanguage(value: CodeLanguage): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLastModified(value: Date): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
      
      inline def setLastModifiedNull: Self = StObject.set(x, "lastModified", null)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPublic(value: Boolean): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
      
      inline def setUpvotes(value: Double): Self = StObject.set(x, "upvotes", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.sololearn.sololearnStrings.c_
    - typings.sololearn.sololearnStrings.cpp
    - typings.sololearn.sololearnStrings.cs
    - typings.sololearn.sololearnStrings.java_
    - typings.sololearn.sololearnStrings.kt
    - typings.sololearn.sololearnStrings.node
    - typings.sololearn.sololearnStrings.php_
    - typings.sololearn.sololearnStrings.py
    - typings.sololearn.sololearnStrings.rb
    - typings.sololearn.sololearnStrings.swift
    - typings.sololearn.sololearnStrings.web
  */
  trait CodeLanguage extends StObject
  object CodeLanguage {
    
    inline def c: c_ = "c".asInstanceOf[c_]
    
    inline def cpp: typings.sololearn.sololearnStrings.cpp = "cpp".asInstanceOf[typings.sololearn.sololearnStrings.cpp]
    
    inline def cs: typings.sololearn.sololearnStrings.cs = "cs".asInstanceOf[typings.sololearn.sololearnStrings.cs]
    
    inline def java_ : typings.sololearn.sololearnStrings.java_ = "java".asInstanceOf[typings.sololearn.sololearnStrings.java_]
    
    inline def kt: typings.sololearn.sololearnStrings.kt = "kt".asInstanceOf[typings.sololearn.sololearnStrings.kt]
    
    inline def node: typings.sololearn.sololearnStrings.node = "node".asInstanceOf[typings.sololearn.sololearnStrings.node]
    
    inline def php: php_ = "php".asInstanceOf[php_]
    
    inline def py: typings.sololearn.sololearnStrings.py = "py".asInstanceOf[typings.sololearn.sololearnStrings.py]
    
    inline def rb: typings.sololearn.sololearnStrings.rb = "rb".asInstanceOf[typings.sololearn.sololearnStrings.rb]
    
    inline def swift: typings.sololearn.sololearnStrings.swift = "swift".asInstanceOf[typings.sololearn.sololearnStrings.swift]
    
    inline def web: typings.sololearn.sololearnStrings.web = "web".asInstanceOf[typings.sololearn.sololearnStrings.web]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.sololearn.sololearnStrings.trending
    - typings.sololearn.sololearnStrings.`most recent`
    - typings.sololearn.sololearnStrings.`most popular`
  */
  trait CodeOrder extends StObject
  object CodeOrder {
    
    inline def `most popular`: typings.sololearn.sololearnStrings.`most popular` = ("most popular").asInstanceOf[typings.sololearn.sololearnStrings.`most popular`]
    
    inline def `most recent`: typings.sololearn.sololearnStrings.`most recent` = ("most recent").asInstanceOf[typings.sololearn.sololearnStrings.`most recent`]
    
    inline def trending: typings.sololearn.sololearnStrings.trending = "trending".asInstanceOf[typings.sololearn.sololearnStrings.trending]
  }
  
  trait Course extends StObject {
    
    /** The level the user is on for that course */
    var level: Double
    
    /** The status of the user for that course */
    var status: Status
    
    /** The amount of XP the user has in that course */
    var xp: Double
  }
  object Course {
    
    inline def apply(level: Double, xp: Double): Course = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], xp = xp.asInstanceOf[js.Any], status = null)
      __obj.asInstanceOf[Course]
    }
    
    extension [Self <: Course](x: Self) {
      
      inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusNull: Self = StObject.set(x, "status", null)
      
      inline def setXp(value: Double): Self = StObject.set(x, "xp", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.sololearn.sololearnStrings.`Angular Plussign NestJS`
    - typings.sololearn.sololearnStrings.C
    - typings.sololearn.sololearnStrings.CPlussignPlussign
    - typings.sololearn.sololearnStrings.CNumbersign
    - typings.sololearn.sololearnStrings.CSS
    - typings.sololearn.sololearnStrings.`DS with Python`
    - typings.sololearn.sololearnStrings.HTML
    - typings.sololearn.sololearnStrings.Java
    - typings.sololearn.sololearnStrings.jQuery
    - typings.sololearn.sololearnStrings.JavaScript
    - typings.sololearn.sololearnStrings.`Machine Learning`
    - typings.sololearn.sololearnStrings.PHP
    - typings.sololearn.sololearnStrings.`Python 3`
    - typings.sololearn.sololearnStrings.Ruby
    - typings.sololearn.sololearnStrings.`React Plussign Redux`
    - typings.sololearn.sololearnStrings.SQL
    - typings.sololearn.sololearnStrings.`Swift 4`
  */
  trait CourseName extends StObject
  object CourseName {
    
    inline def `Angular Plussign NestJS`: typings.sololearn.sololearnStrings.`Angular Plussign NestJS` = ("Angular + NestJS").asInstanceOf[typings.sololearn.sololearnStrings.`Angular Plussign NestJS`]
    
    inline def C: typings.sololearn.sololearnStrings.C = "C".asInstanceOf[typings.sololearn.sololearnStrings.C]
    
    inline def CNumbersign: typings.sololearn.sololearnStrings.CNumbersign = "C#".asInstanceOf[typings.sololearn.sololearnStrings.CNumbersign]
    
    inline def CPlussignPlussign: typings.sololearn.sololearnStrings.CPlussignPlussign = "C++".asInstanceOf[typings.sololearn.sololearnStrings.CPlussignPlussign]
    
    inline def CSS: typings.sololearn.sololearnStrings.CSS = "CSS".asInstanceOf[typings.sololearn.sololearnStrings.CSS]
    
    inline def `DS with Python`: typings.sololearn.sololearnStrings.`DS with Python` = ("DS with Python").asInstanceOf[typings.sololearn.sololearnStrings.`DS with Python`]
    
    inline def HTML: typings.sololearn.sololearnStrings.HTML = "HTML".asInstanceOf[typings.sololearn.sololearnStrings.HTML]
    
    inline def Java: typings.sololearn.sololearnStrings.Java = "Java".asInstanceOf[typings.sololearn.sololearnStrings.Java]
    
    inline def JavaScript: typings.sololearn.sololearnStrings.JavaScript = "JavaScript".asInstanceOf[typings.sololearn.sololearnStrings.JavaScript]
    
    inline def `Machine Learning`: typings.sololearn.sololearnStrings.`Machine Learning` = ("Machine Learning").asInstanceOf[typings.sololearn.sololearnStrings.`Machine Learning`]
    
    inline def PHP: typings.sololearn.sololearnStrings.PHP = "PHP".asInstanceOf[typings.sololearn.sololearnStrings.PHP]
    
    inline def `Python 3`: typings.sololearn.sololearnStrings.`Python 3` = ("Python 3").asInstanceOf[typings.sololearn.sololearnStrings.`Python 3`]
    
    inline def `React Plussign Redux`: typings.sololearn.sololearnStrings.`React Plussign Redux` = ("React + Redux").asInstanceOf[typings.sololearn.sololearnStrings.`React Plussign Redux`]
    
    inline def Ruby: typings.sololearn.sololearnStrings.Ruby = "Ruby".asInstanceOf[typings.sololearn.sololearnStrings.Ruby]
    
    inline def SQL: typings.sololearn.sololearnStrings.SQL = "SQL".asInstanceOf[typings.sololearn.sololearnStrings.SQL]
    
    inline def `Swift 4`: typings.sololearn.sololearnStrings.`Swift 4` = ("Swift 4").asInstanceOf[typings.sololearn.sololearnStrings.`Swift 4`]
    
    inline def jQuery: typings.sololearn.sololearnStrings.jQuery = "jQuery".asInstanceOf[typings.sololearn.sololearnStrings.jQuery]
  }
  
  trait Leader extends StObject {
    
    /** The user's ID */
    var id: Double
    
    /** The level the user is on for the specified course or overall */
    var level: Double
    
    /** The user's name */
    var name: String
    
    /** The user's rank on the leaderboard (`1` - `10`) */
    var rank: Double
    
    /** The status of the user for the specified course or overall */
    var status: Status
    
    /** The amount of XP the user has in the specified course or overall */
    var xp: Double
  }
  object Leader {
    
    inline def apply(id: Double, level: Double, name: String, rank: Double, xp: Double): Leader = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any], xp = xp.asInstanceOf[js.Any], status = null)
      __obj.asInstanceOf[Leader]
    }
    
    extension [Self <: Leader](x: Self) {
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusNull: Self = StObject.set(x, "status", null)
      
      inline def setXp(value: Double): Self = StObject.set(x, "xp", value.asInstanceOf[js.Any])
    }
  }
  
  trait Question extends StObject {
    
    /** An array of the top 20 answers to the question, sorted by upvotes. This does not include the best answer */
    var answers: js.Array[Answer]
    
    /** The author's SoloLearn ID */
    var author: Double
    
    /** The answer that is marked as best, or `null` if there is no best answer */
    var bestAnswer: Answer | Null
    
    /** The content of the question */
    var content: String
    
    /** The date the question was written */
    var date: Date
    
    /** The question's ID */
    var id: Double
    
    /** The tags that the question has */
    var tags: js.Array[String]
    
    /** The title of the question */
    var title: String
    
    /** The amount of upvotes the question has */
    var upvotes: Double
  }
  object Question {
    
    inline def apply(
      answers: js.Array[Answer],
      author: Double,
      content: String,
      date: Date,
      id: Double,
      tags: js.Array[String],
      title: String,
      upvotes: Double
    ): Question = {
      val __obj = js.Dynamic.literal(answers = answers.asInstanceOf[js.Any], author = author.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], upvotes = upvotes.asInstanceOf[js.Any], bestAnswer = null)
      __obj.asInstanceOf[Question]
    }
    
    extension [Self <: Question](x: Self) {
      
      inline def setAnswers(value: js.Array[Answer]): Self = StObject.set(x, "answers", value.asInstanceOf[js.Any])
      
      inline def setAnswersVarargs(value: Answer*): Self = StObject.set(x, "answers", js.Array(value :_*))
      
      inline def setAuthor(value: Double): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      inline def setBestAnswer(value: Answer): Self = StObject.set(x, "bestAnswer", value.asInstanceOf[js.Any])
      
      inline def setBestAnswerNull: Self = StObject.set(x, "bestAnswer", null)
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setUpvotes(value: Double): Self = StObject.set(x, "upvotes", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.sololearn.sololearnStrings.trending
    - typings.sololearn.sololearnStrings.`most recent`
    - typings.sololearn.sololearnStrings.unanswered
  */
  trait QuestionOrder extends StObject
  object QuestionOrder {
    
    inline def `most recent`: typings.sololearn.sololearnStrings.`most recent` = ("most recent").asInstanceOf[typings.sololearn.sololearnStrings.`most recent`]
    
    inline def trending: typings.sololearn.sololearnStrings.trending = "trending".asInstanceOf[typings.sololearn.sololearnStrings.trending]
    
    inline def unanswered: typings.sololearn.sololearnStrings.unanswered = "unanswered".asInstanceOf[typings.sololearn.sololearnStrings.unanswered]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.sololearn.sololearnStrings.Bronze
    - typings.sololearn.sololearnStrings.Silver
    - typings.sololearn.sololearnStrings.Gold
    - typings.sololearn.sololearnStrings.Platinum
    - scala.Null
  */
  type Status = _Status | Null
  
  trait User extends StObject {
    
    /**
      * An array of the user's badges where each badge is a `string`.
      * The array is sorted by when the user recieved the badge, the last item in the array is the first badge they got, the first item in the array is their latest badge
      */
    var badges: js.Array[Badge]
    
    /** An array of the user's certificates, where each certificate is a `string` which is the name of the course the certificate is associated to */
    var certificates: js.Array[CourseName]
    
    /** An array of the user's codes ordered descendingly by the number of upvotes the code has, this will only return public codes */
    var codes: js.Array[Code]
    
    /** An object where the property is the name of the course (see all course names [here](https://github.com/sololearnts/sololearn#coursename)) */
    var courses: /** The name of the course */
    StringDictionary[Course]
    
    /** The user's ID */
    var id: Double
    
    /** The level the user is on */
    var level: Double
    
    /** The user's name */
    var name: String
    
    /** The user's overall status */
    var status: Status
    
    /** The amount of XP the user has */
    var xp: Double
  }
  object User {
    
    inline def apply(
      badges: js.Array[Badge],
      certificates: js.Array[CourseName],
      codes: js.Array[Code],
      courses: /** The name of the course */
    StringDictionary[Course],
      id: Double,
      level: Double,
      name: String,
      xp: Double
    ): User = {
      val __obj = js.Dynamic.literal(badges = badges.asInstanceOf[js.Any], certificates = certificates.asInstanceOf[js.Any], codes = codes.asInstanceOf[js.Any], courses = courses.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], xp = xp.asInstanceOf[js.Any], status = null)
      __obj.asInstanceOf[User]
    }
    
    extension [Self <: User](x: Self) {
      
      inline def setBadges(value: js.Array[Badge]): Self = StObject.set(x, "badges", value.asInstanceOf[js.Any])
      
      inline def setBadgesVarargs(value: Badge*): Self = StObject.set(x, "badges", js.Array(value :_*))
      
      inline def setCertificates(value: js.Array[CourseName]): Self = StObject.set(x, "certificates", value.asInstanceOf[js.Any])
      
      inline def setCertificatesVarargs(value: CourseName*): Self = StObject.set(x, "certificates", js.Array(value :_*))
      
      inline def setCodes(value: js.Array[Code]): Self = StObject.set(x, "codes", value.asInstanceOf[js.Any])
      
      inline def setCodesVarargs(value: Code*): Self = StObject.set(x, "codes", js.Array(value :_*))
      
      inline def setCourses(value: /** The name of the course */
      StringDictionary[Course]): Self = StObject.set(x, "courses", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusNull: Self = StObject.set(x, "status", null)
      
      inline def setXp(value: Double): Self = StObject.set(x, "xp", value.asInstanceOf[js.Any])
    }
  }
  
  trait _Status extends StObject
}
