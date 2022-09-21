package typings.solidityParserAntlr.mod

import typings.solidityParserAntlr.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def parse(sourceCode: String, parserOpts: ParserOpts): ASTNode = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(sourceCode.asInstanceOf[js.Any], parserOpts.asInstanceOf[js.Any])).asInstanceOf[ASTNode]

inline def visit(ast: ASTNode, visitor: Visitor): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("visit")(ast.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any])).asInstanceOf[Unit]
