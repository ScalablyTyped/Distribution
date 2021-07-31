package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldRatingScaleQuestionAnswer
  extends StObject
     with ClientValueObject {
  
  def get_answer(): Double
  
  def get_question(): String
  
  def set_answer(value: Double): Unit
  
  def set_question(value: String): Unit
}
object FieldRatingScaleQuestionAnswer {
  
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_answer: () => Double,
    get_question: () => String,
    get_typeId: () => String,
    set_answer: Double => Unit,
    set_question: String => Unit,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): FieldRatingScaleQuestionAnswer = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_answer = js.Any.fromFunction0(get_answer), get_question = js.Any.fromFunction0(get_question), get_typeId = js.Any.fromFunction0(get_typeId), set_answer = js.Any.fromFunction1(set_answer), set_question = js.Any.fromFunction1(set_question), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[FieldRatingScaleQuestionAnswer]
  }
  
  @scala.inline
  implicit class FieldRatingScaleQuestionAnswerMutableBuilder[Self <: FieldRatingScaleQuestionAnswer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet_answer(value: () => Double): Self = StObject.set(x, "get_answer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_question(value: () => String): Self = StObject.set(x, "get_question", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet_answer(value: Double => Unit): Self = StObject.set(x, "set_answer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_question(value: String => Unit): Self = StObject.set(x, "set_question", js.Any.fromFunction1(value))
  }
}
