package typings.relayDashCompiler.libCoreSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Schema extends js.Object {
  def assertEnumType(`type`: TypeID): EnumTypeID
  def assertInputObjectType(`type`: TypeID): InputObjectTypeID
  def expectStringType(): ScalarTypeID
  def getEnumValues(`type`: EnumTypeID): js.Array[String]
  def getFieldName(field: FieldID): String
  def getFieldType(field: FieldID): TypeID
  def getFields(`type`: TypeID): js.Array[FieldID]
  def getListItemType(`type`: TypeID): TypeID
  def getNullableType(`type`: TypeID): TypeID
  def getTypeString(`type`: TypeID): String
  def isAbstractType(`type`: TypeID): Boolean
  def isEnum(`type`: TypeID): Boolean
  def isInputObject(`type`: TypeID): Boolean
  def isInterface(`type`: TypeID): Boolean
  def isList(`type`: TypeID): Boolean
  def isNonNull(`type`: TypeID): Boolean
  def isObject(`type`: TypeID): Boolean
  def isScalar(`type`: TypeID): Boolean
  def isUnion(`type`: TypeID): Boolean
}

object Schema {
  @scala.inline
  def apply(
    assertEnumType: TypeID => EnumTypeID,
    assertInputObjectType: TypeID => InputObjectTypeID,
    expectStringType: () => ScalarTypeID,
    getEnumValues: EnumTypeID => js.Array[String],
    getFieldName: FieldID => String,
    getFieldType: FieldID => TypeID,
    getFields: TypeID => js.Array[FieldID],
    getListItemType: TypeID => TypeID,
    getNullableType: TypeID => TypeID,
    getTypeString: TypeID => String,
    isAbstractType: TypeID => Boolean,
    isEnum: TypeID => Boolean,
    isInputObject: TypeID => Boolean,
    isInterface: TypeID => Boolean,
    isList: TypeID => Boolean,
    isNonNull: TypeID => Boolean,
    isObject: TypeID => Boolean,
    isScalar: TypeID => Boolean,
    isUnion: TypeID => Boolean
  ): Schema = {
    val __obj = js.Dynamic.literal(assertEnumType = js.Any.fromFunction1(assertEnumType), assertInputObjectType = js.Any.fromFunction1(assertInputObjectType), expectStringType = js.Any.fromFunction0(expectStringType), getEnumValues = js.Any.fromFunction1(getEnumValues), getFieldName = js.Any.fromFunction1(getFieldName), getFieldType = js.Any.fromFunction1(getFieldType), getFields = js.Any.fromFunction1(getFields), getListItemType = js.Any.fromFunction1(getListItemType), getNullableType = js.Any.fromFunction1(getNullableType), getTypeString = js.Any.fromFunction1(getTypeString), isAbstractType = js.Any.fromFunction1(isAbstractType), isEnum = js.Any.fromFunction1(isEnum), isInputObject = js.Any.fromFunction1(isInputObject), isInterface = js.Any.fromFunction1(isInterface), isList = js.Any.fromFunction1(isList), isNonNull = js.Any.fromFunction1(isNonNull), isObject = js.Any.fromFunction1(isObject), isScalar = js.Any.fromFunction1(isScalar), isUnion = js.Any.fromFunction1(isUnion))
  
    __obj.asInstanceOf[Schema]
  }
}

