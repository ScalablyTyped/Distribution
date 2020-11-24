package typings.snowflakeSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Column extends js.Object {
  
  /**
    * Returns the id of this column.
    */
  def getId(): Double = js.native
  
  /**
    * Returns the index of this column.
    */
  def getIndex(): Double = js.native
  
  /**
    * Returns the name of this column.
    */
  def getName(): String = js.native
  
  /**
    * Returns the scale associated with this column.
    */
  def getScale(): Double = js.native
  
  /**
    * Retuns the type associated with this column.
    */
  def getType(): String = js.native
  
  /**
    * Determines if this column is nullable.
    */
  def isNullable(): Boolean = js.native
}
object Column {
  
  @scala.inline
  def apply(
    getId: () => Double,
    getIndex: () => Double,
    getName: () => String,
    getScale: () => Double,
    getType: () => String,
    isNullable: () => Boolean
  ): Column = {
    val __obj = js.Dynamic.literal(getId = js.Any.fromFunction0(getId), getIndex = js.Any.fromFunction0(getIndex), getName = js.Any.fromFunction0(getName), getScale = js.Any.fromFunction0(getScale), getType = js.Any.fromFunction0(getType), isNullable = js.Any.fromFunction0(isNullable))
    __obj.asInstanceOf[Column]
  }
  
  @scala.inline
  implicit class ColumnOps[Self <: Column] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetId(value: () => Double): Self = this.set("getId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIndex(value: () => Double): Self = this.set("getIndex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetName(value: () => String): Self = this.set("getName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetScale(value: () => Double): Self = this.set("getScale", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetType(value: () => String): Self = this.set("getType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsNullable(value: () => Boolean): Self = this.set("isNullable", js.Any.fromFunction0(value))
  }
}
