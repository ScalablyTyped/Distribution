package typings.regjsparser.mod

import typings.regjsparser.anon.Behavior
import typings.regjsparser.anon.BehaviorBody
import typings.regjsparser.anon.Body
import typings.regjsparser.anon.ModifierFlagsUndefined
import typings.regjsparser.anon.Name
import typings.regjsparser.anon.NameUndefined
import typings.regjsparser.mod.^
import typings.regjsparser.regjsparserStrings.dot
import typings.regjsparser.regjsparserStrings.group
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def parse[F /* <: Features */](str: String, flags: String): RootNode[F] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[RootNode[F]]
inline def parse[F /* <: Features */](str: String, flags: String, features: F): RootNode[F] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], features.asInstanceOf[js.Any])).asInstanceOf[RootNode[F]]

/* Rewritten from type alias, can be one of: 
  - typings.regjsparser.mod.Alternative[F]
  - typings.regjsparser.mod.Anchor
  - typings.regjsparser.mod.CharacterClass[F]
  - typings.regjsparser.mod.CharacterClassEscape
  - typings.regjsparser.mod.CharacterClassRange
  - typings.regjsparser.mod.Disjunction[F]
  - typings.regjsparser.mod.Dot
  - typings.regjsparser.mod.Group[F]
  - typings.regjsparser.mod.Quantifier[F]
  - typings.regjsparser.mod.Reference[F]
  - typings.regjsparser.mod.If[
/ * import warning: importer.ImportType#apply Failed type conversion: F['unicodePropertyEscape'] * / js.Any, 
typings.regjsparser.mod.UnicodePropertyEscape, 
scala.Nothing]
  - typings.regjsparser.mod.Value
*/
type AstNode[F /* <: Features */] = _AstNode[F] | (If[
/* import warning: importer.ImportType#apply Failed type conversion: F['unicodePropertyEscape'] */ js.Any, 
UnicodePropertyEscape, 
scala.Nothing]) | Dot | Group[F] | Reference[F]

type CapturingGroup[F /* <: Features */] = Base[group] & Behavior[F] & (If[
/* import warning: importer.ImportType#apply Failed type conversion: F['namedGroups'] */ js.Any, 
Name, 
NameUndefined])

type Dot = Base[dot]

type Group[F /* <: Features */] = CapturingGroup[F] | NonCapturingGroup[F]

type NonCapturingGroup[F /* <: Features */] = (Body[F] & Base[group]) | (BehaviorBody[F] & (If[
/* import warning: importer.ImportType#apply Failed type conversion: F['modifiers'] */ js.Any, 
typings.regjsparser.anon.ModifierFlags, 
ModifierFlagsUndefined]) & Base[group])

type Reference[F /* <: Features */] = If[
/* import warning: importer.ImportType#apply Failed type conversion: F['namedGroups'] */ js.Any, 
NamedReference, 
IndexReference]

type RootNode[F /* <: Features */] = Exclude[AstNode[F], CharacterClassRange]
