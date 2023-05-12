package typings.revealJs

import typings.revealJs.mod.Plugin
import typings.revealJs.mod.PluginFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Reveal plugin math
  *
  * @see {@link https://github.com/hakimel/reveal.js/tree/master/plugin/math}
  */
/* Inlined reveal.js.reveal.js.PluginFunction & {  KaTeX :reveal.js.reveal.js.PluginFunction,   MathJax2 :reveal.js.reveal.js.PluginFunction,   MathJax3 :reveal.js.reveal.js.PluginFunction} */
object pluginMathMathMod {
  
  inline def apply(): Plugin = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Plugin]
  
  @JSImport("reveal.js/plugin/math/math", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def KaTeX(): Plugin = ^.asInstanceOf[js.Dynamic].applyDynamic("KaTeX")().asInstanceOf[Plugin]
  @JSImport("reveal.js/plugin/math/math", "KaTeX")
  @js.native
  def KaTeX_FpluginMathMathMod: PluginFunction = js.native
  
  inline def KaTeX_FpluginMathMathMod_=(x: PluginFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("KaTeX")(x.asInstanceOf[js.Any])
  
  inline def MathJax2(): Plugin = ^.asInstanceOf[js.Dynamic].applyDynamic("MathJax2")().asInstanceOf[Plugin]
  @JSImport("reveal.js/plugin/math/math", "MathJax2")
  @js.native
  def MathJax2_FpluginMathMathMod: PluginFunction = js.native
  
  inline def MathJax2_FpluginMathMathMod_=(x: PluginFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MathJax2")(x.asInstanceOf[js.Any])
  
  inline def MathJax3(): Plugin = ^.asInstanceOf[js.Dynamic].applyDynamic("MathJax3")().asInstanceOf[Plugin]
  @JSImport("reveal.js/plugin/math/math", "MathJax3")
  @js.native
  def MathJax3_FpluginMathMathMod: PluginFunction = js.native
  
  inline def MathJax3_FpluginMathMathMod_=(x: PluginFunction): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MathJax3")(x.asInstanceOf[js.Any])
}
