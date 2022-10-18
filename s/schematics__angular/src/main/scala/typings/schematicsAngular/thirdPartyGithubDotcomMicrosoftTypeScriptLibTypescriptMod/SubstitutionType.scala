package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubstitutionType
  extends StObject
     with Type {
  
  var baseType: Type
  
  var objectFlags: ObjectFlags
  
  var substitute: Type
}
object SubstitutionType {
  
  inline def apply(
    baseType: Type,
    flags: TypeFlags,
    getApparentProperties: () => js.Array[Symbol],
    getBaseTypes: () => js.UndefOr[js.Array[BaseType]],
    getCallSignatures: () => js.Array[Signature],
    getConstraint: () => js.UndefOr[Type],
    getConstructSignatures: () => js.Array[Signature],
    getDefault: () => js.UndefOr[Type],
    getFlags: () => TypeFlags,
    getNonNullableType: () => Type,
    getNumberIndexType: () => js.UndefOr[Type],
    getProperties: () => js.Array[Symbol],
    getProperty: java.lang.String => js.UndefOr[Symbol],
    getStringIndexType: () => js.UndefOr[Type],
    getSymbol: () => js.UndefOr[Symbol],
    isClass: () => /* is @schematics/angular.@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript.InterfaceType */ Boolean,
    isClassOrInterface: () => /* is @schematics/angular.@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript.InterfaceType */ Boolean,
    isIndexType: () => /* is @schematics/angular.@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript.IndexType */ Boolean,
    isIntersection: () => /* is @schematics/angular.@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript.IntersectionType */ Boolean,
    isLiteral: () => /* is @schematics/angular.@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript.LiteralType */ Boolean,
    isNumberLiteral: () => /* is @schematics/angular.@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript.NumberLiteralType */ Boolean,
    isStringLiteral: () => /* is @schematics/angular.@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript.StringLiteralType */ Boolean,
    isTypeParameter: () => /* is @schematics/angular.@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript.TypeParameter */ Boolean,
    isUnion: () => /* is @schematics/angular.@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript.UnionType */ Boolean,
    isUnionOrIntersection: () => /* is @schematics/angular.@schematics/angular/third_party/github.com/Microsoft/TypeScript/lib/typescript.UnionOrIntersectionType */ Boolean,
    objectFlags: ObjectFlags,
    substitute: Type,
    symbol: Symbol
  ): SubstitutionType = {
    val __obj = js.Dynamic.literal(baseType = baseType.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], getApparentProperties = js.Any.fromFunction0(getApparentProperties), getBaseTypes = js.Any.fromFunction0(getBaseTypes), getCallSignatures = js.Any.fromFunction0(getCallSignatures), getConstraint = js.Any.fromFunction0(getConstraint), getConstructSignatures = js.Any.fromFunction0(getConstructSignatures), getDefault = js.Any.fromFunction0(getDefault), getFlags = js.Any.fromFunction0(getFlags), getNonNullableType = js.Any.fromFunction0(getNonNullableType), getNumberIndexType = js.Any.fromFunction0(getNumberIndexType), getProperties = js.Any.fromFunction0(getProperties), getProperty = js.Any.fromFunction1(getProperty), getStringIndexType = js.Any.fromFunction0(getStringIndexType), getSymbol = js.Any.fromFunction0(getSymbol), isClass = js.Any.fromFunction0(isClass), isClassOrInterface = js.Any.fromFunction0(isClassOrInterface), isIndexType = js.Any.fromFunction0(isIndexType), isIntersection = js.Any.fromFunction0(isIntersection), isLiteral = js.Any.fromFunction0(isLiteral), isNumberLiteral = js.Any.fromFunction0(isNumberLiteral), isStringLiteral = js.Any.fromFunction0(isStringLiteral), isTypeParameter = js.Any.fromFunction0(isTypeParameter), isUnion = js.Any.fromFunction0(isUnion), isUnionOrIntersection = js.Any.fromFunction0(isUnionOrIntersection), objectFlags = objectFlags.asInstanceOf[js.Any], substitute = substitute.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubstitutionType]
  }
  
  extension [Self <: SubstitutionType](x: Self) {
    
    inline def setBaseType(value: Type): Self = StObject.set(x, "baseType", value.asInstanceOf[js.Any])
    
    inline def setObjectFlags(value: ObjectFlags): Self = StObject.set(x, "objectFlags", value.asInstanceOf[js.Any])
    
    inline def setSubstitute(value: Type): Self = StObject.set(x, "substitute", value.asInstanceOf[js.Any])
  }
}
