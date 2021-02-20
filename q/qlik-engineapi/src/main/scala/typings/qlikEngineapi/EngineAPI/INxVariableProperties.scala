package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxVariableProperties...
  */
@js.native
trait INxVariableProperties extends StObject {
  
  /**
    * Set this property to true to update the variable when applying a bookmark.
    * The value of a variable can affect the state of the selections.
    * >> The default value is false.
    */
  var qIncludeInBookmark: Boolean = js.native
  
  /**
    * Name of the variable.
    */
  var qName: String = js.native
  
  /**
    * Defines the format of the value of a variable.
    */
  var qNumberPresentation: IFieldAttributes = js.native
  
  /**
    * List of enumerations.
    * This property is used if qUsePredefListedValues is set to true.
    */
  var qPreDefinedList: js.Array[String] = js.native
  
  /**
    * The value of a variable can be an enumeration.
    * Set this property to true to reflect the predefined values in an enumeration.
    */
  var qUsePredefListedValues: Boolean = js.native
}
object INxVariableProperties {
  
  @scala.inline
  def apply(
    qIncludeInBookmark: Boolean,
    qName: String,
    qNumberPresentation: IFieldAttributes,
    qPreDefinedList: js.Array[String],
    qUsePredefListedValues: Boolean
  ): INxVariableProperties = {
    val __obj = js.Dynamic.literal(qIncludeInBookmark = qIncludeInBookmark.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any], qNumberPresentation = qNumberPresentation.asInstanceOf[js.Any], qPreDefinedList = qPreDefinedList.asInstanceOf[js.Any], qUsePredefListedValues = qUsePredefListedValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxVariableProperties]
  }
  
  @scala.inline
  implicit class INxVariablePropertiesMutableBuilder[Self <: INxVariableProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQIncludeInBookmark(value: Boolean): Self = StObject.set(x, "qIncludeInBookmark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQName(value: String): Self = StObject.set(x, "qName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQNumberPresentation(value: IFieldAttributes): Self = StObject.set(x, "qNumberPresentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQPreDefinedList(value: js.Array[String]): Self = StObject.set(x, "qPreDefinedList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQPreDefinedListVarargs(value: String*): Self = StObject.set(x, "qPreDefinedList", js.Array(value :_*))
    
    @scala.inline
    def setQUsePredefListedValues(value: Boolean): Self = StObject.set(x, "qUsePredefListedValues", value.asInstanceOf[js.Any])
  }
}
