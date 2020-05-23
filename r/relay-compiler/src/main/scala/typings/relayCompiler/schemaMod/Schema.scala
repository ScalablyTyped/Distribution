package typings.relayCompiler.schemaMod

import typings.graphql.astMod.DocumentNode
import typings.graphql.astMod.TypeNode
import typings.graphql.astMod.ValueNode
import typings.relayCompiler.anon.Args
import typings.relayCompiler.iRMod.Field
import typings.std.ReadonlySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema extends js.Object {
  def areEqualTypes(typeA: TypeID, typeB: TypeID): Boolean = js.native
  def asCompositeType(`type`: js.Any): js.UndefOr[CompositeTypeID | Null] = js.native
  def asInputType(`type`: js.Any): js.UndefOr[InputTypeID | Null] = js.native
  def asScalarFieldType(`type`: js.Any): js.UndefOr[ScalarFieldTypeID | Null] = js.native
  def assertAbstractType(`type`: TypeID): AbstractTypeID = js.native
  def assertBooleanType(`type`: TypeID): ScalarTypeID = js.native
  def assertCompositeType(`type`: TypeID): CompositeTypeID = js.native
  def assertEnumType(`type`: TypeID): EnumTypeID = js.native
  def assertFloatType(`type`: TypeID): ScalarTypeID = js.native
  def assertIdType(`type`: TypeID): ScalarTypeID = js.native
  def assertInputObjectType(`type`: TypeID): InputObjectTypeID = js.native
  def assertInputType(`type`: js.Any): InputTypeID = js.native
  def assertIntType(`type`: TypeID): ScalarTypeID = js.native
  def assertInterfaceType(`type`: TypeID): InterfaceTypeID = js.native
  def assertLeafType(`type`: TypeID): TypeID = js.native
  def assertLinkedFieldType(`type`: js.Any): LinkedFieldTypeID = js.native
  def assertObjectType(`type`: TypeID): ObjectTypeID = js.native
  def assertScalarFieldType(`type`: js.Any): ScalarFieldTypeID = js.native
  def assertScalarType(`type`: TypeID): ScalarTypeID = js.native
  def assertStringType(`type`: TypeID): ScalarTypeID = js.native
  def assertUnionType(`type`: TypeID): UnionTypeID = js.native
  def canHaveSelections(`type`: TypeID): Boolean = js.native
  def doTypesOverlap(typeA: CompositeTypeID, typeB: CompositeTypeID): Boolean = js.native
  def expectBooleanType(): ScalarTypeID = js.native
  def expectField(`type`: CompositeTypeID | InputObjectTypeID, fieldName: String): FieldID = js.native
  def expectFloatType(): ScalarTypeID = js.native
  def expectIdType(): ScalarTypeID = js.native
  def expectIntType(): ScalarTypeID = js.native
  def expectMutationType(): ObjectTypeID = js.native
  def expectQueryType(): ObjectTypeID = js.native
  def expectStringType(): ScalarTypeID = js.native
  def expectSubscriptionType(): ObjectTypeID = js.native
  def expectTypeFromAST(ast: TypeNode): TypeID = js.native
  def expectTypeFromString(typeName: String): TypeID = js.native
  def extend(extensions: js.Array[String]): Schema = js.native
  def extend(extensions: DocumentNode): Schema = js.native
  def getDirective(directiveName: String): js.UndefOr[Directive | Null] = js.native
  def getDirectives(): js.Array[Directive] = js.native
  def getEnumValues(`type`: EnumTypeID): js.Array[String] = js.native
  def getFieldArgByName(field: FieldID, argName: String): js.UndefOr[Argument | Null] = js.native
  def getFieldArgs(field: FieldID): js.Array[Argument] = js.native
  def getFieldByName(`type`: CompositeTypeID | InputObjectTypeID, fieldName: String): js.UndefOr[FieldID | Null] = js.native
  def getFieldConfig(field: FieldID): Args = js.native
  def getFieldName(field: FieldID): String = js.native
  def getFieldParentType(field: FieldID): TypeID = js.native
  def getFieldType(field: FieldID): TypeID = js.native
  def getFields(`type`: TypeID): js.Array[FieldID] = js.native
  def getInterfaces(`type`: CompositeTypeID): js.Array[TypeID] = js.native
  def getListItemType(`type`: TypeID): TypeID = js.native
  def getMutationType(): js.UndefOr[ObjectTypeID | Null] = js.native
  def getNonNullType(`type`: TypeID): TypeID = js.native
  def getNullableType(`type`: TypeID): TypeID = js.native
  def getPossibleTypes(`type`: AbstractTypeID): ReadonlySet[ObjectTypeID] = js.native
  def getQueryType(): js.UndefOr[ObjectTypeID | Null] = js.native
  def getRawType(`type`: TypeID): TypeID = js.native
  def getSubscriptionType(): js.UndefOr[ObjectTypeID | Null] = js.native
  def getTypeFromAST(typeNode: TypeNode): js.UndefOr[TypeID | Null] = js.native
  def getTypeFromString(typeName: String): js.UndefOr[TypeID | Null] = js.native
  def getTypeString(`type`: TypeID): String = js.native
  def getTypes(): js.Array[TypeID] = js.native
  def getUnionTypes(`type`: UnionTypeID): js.Array[TypeID] = js.native
  def hasField(`type`: CompositeTypeID | InputObjectTypeID, fieldName: String): Boolean = js.native
  def hasId(`type`: CompositeTypeID): Boolean = js.native
  def implementsInterface(`type`: CompositeTypeID, interfaceType: InterfaceTypeID): Boolean = js.native
  def isAbstractType(`type`: TypeID): Boolean = js.native
  def isBoolean(`type`: TypeID): Boolean = js.native
  def isClientDefinedField(`type`: CompositeTypeID, field: Field): Boolean = js.native
  def isCompositeType(`type`: TypeID): Boolean = js.native
  def isEnum(`type`: TypeID): Boolean = js.native
  def isFloat(`type`: TypeID): Boolean = js.native
  def isId(`type`: TypeID): Boolean = js.native
  def isInputObject(`type`: TypeID): Boolean = js.native
  def isInputType(`type`: TypeID): Boolean = js.native
  def isInt(`type`: TypeID): Boolean = js.native
  def isInterface(`type`: TypeID): Boolean = js.native
  def isLeafType(`type`: TypeID): Boolean = js.native
  def isList(`type`: TypeID): Boolean = js.native
  def isNonNull(`type`: TypeID): Boolean = js.native
  def isObject(`type`: TypeID): Boolean = js.native
  def isPossibleType(superType: AbstractTypeID, maybeSubType: ObjectTypeID): Boolean = js.native
  def isScalar(`type`: TypeID): Boolean = js.native
  def isServerDefinedField(`type`: CompositeTypeID, field: Field): Boolean = js.native
  def isServerDirective(directiveName: String): Boolean = js.native
  def isServerField(field: FieldID): Boolean = js.native
  def isServerType(`type`: TypeID): Boolean = js.native
  def isString(`type`: TypeID): Boolean = js.native
  def isTypeSubTypeOf(maybeSubType: TypeID, superType: TypeID): Boolean = js.native
  def isUnion(`type`: TypeID): Boolean = js.native
  def isWrapper(`type`: TypeID): Boolean = js.native
  def mayImplement(`type`: CompositeTypeID, interfaceType: InterfaceTypeID): Boolean = js.native
  def parseLiteral(`type`: EnumTypeID | ScalarTypeID, valueNode: ValueNode): js.Any = js.native
  def parseValue(`type`: EnumTypeID | ScalarTypeID, value: js.Any): js.Any = js.native
  def serialize(`type`: EnumTypeID | ScalarTypeID, value: js.Any): js.Any = js.native
}

