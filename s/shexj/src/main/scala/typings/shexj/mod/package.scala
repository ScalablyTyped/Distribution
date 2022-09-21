package typings.shexj.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type BNODE = String

type BOOL = Boolean

type DECIMAL = Double

type DOUBLE = Double

type INTEGER = Double

type IRI = String

type IRIREF = String

type LANGTAG = String

type STRING = String

type numericLiteral = INTEGER | DECIMAL | DOUBLE

type objectValue = IRIREF | ObjectLiteral

type shapeDeclLabel = IRIREF | BNODE

type shapeDeclRef = shapeDeclLabel

type shapeExprOrRef = shapeExpr | shapeDeclRef

type tripleExprLabel = IRIREF | BNODE

type tripleExprOrRef = tripleExpr | tripleExprRef

type tripleExprRef = tripleExprLabel

/* Rewritten from type alias, can be one of: 
  - typings.shexj.mod.objectValue
  - typings.shexj.mod.IriStem
  - typings.shexj.mod.IriStemRange
  - typings.shexj.mod.LiteralStem
  - typings.shexj.mod.LiteralStemRange
  - typings.shexj.mod.Language
  - typings.shexj.mod.LanguageStem
  - typings.shexj.mod.LanguageStemRange
*/
type valueSetValue = _valueSetValue | objectValue
