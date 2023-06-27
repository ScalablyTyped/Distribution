package typings.speechRuleEngine.jsSpeechRulesAlphabetMod

import org.scalablytyped.runtime.StringDictionary
import typings.speechRuleEngine.jsSpeechRulesAlphabetMod.^
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def INTERVALS: Map[String, Alphabet] = ^.asInstanceOf[js.Dynamic].selectDynamic("INTERVALS").asInstanceOf[Map[String, Alphabet]]

inline def alphabetName(base: String, font: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("alphabetName")(base.asInstanceOf[js.Any], font.asInstanceOf[js.Any])).asInstanceOf[String]

inline def makeCodeInterval(ints: js.Array[String | (js.Tuple2[String, String])]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeCodeInterval")(ints.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]

inline def makeInterval(param0: js.Tuple2[String, String], subst: StringDictionary[String | Boolean]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeInterval")(param0.asInstanceOf[js.Any], subst.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]

inline def makeMultiInterval(ints: js.Array[String | (js.Tuple2[String, String])]): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeMultiInterval")(ints.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
