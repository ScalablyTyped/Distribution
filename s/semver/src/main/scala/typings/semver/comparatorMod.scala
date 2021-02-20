package typings.semver

import typings.semver.mod.Options
import typings.semver.semverStrings.Equalssign
import typings.semver.semverStrings.Greaterthansign
import typings.semver.semverStrings.GreaterthansignEqualssign
import typings.semver.semverStrings.Lessthansign
import typings.semver.semverStrings.LessthansignEqualssign
import typings.semver.semverStrings._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object comparatorMod {
  
  @JSImport("semver/classes/comparator", JSImport.Namespace)
  @js.native
  class ^ protected () extends Comparator {
    def this(comp: String) = this()
    def this(comp: Comparator) = this()
    def this(comp: String, optionsOrLoose: Boolean) = this()
    def this(comp: String, optionsOrLoose: Options) = this()
    def this(comp: Comparator, optionsOrLoose: Boolean) = this()
    def this(comp: Comparator, optionsOrLoose: Options) = this()
  }
  
  @js.native
  trait Comparator extends StObject {
    
    def intersects(comp: Comparator): Boolean = js.native
    def intersects(comp: Comparator, optionsOrLoose: Boolean): Boolean = js.native
    def intersects(comp: Comparator, optionsOrLoose: Options): Boolean = js.native
    
    var loose: Boolean = js.native
    
    var operator: _empty | Equalssign | Lessthansign | Greaterthansign | LessthansignEqualssign | GreaterthansignEqualssign = js.native
    
    var options: Options = js.native
    
    def parse(comp: String): Unit = js.native
    
    var semver: typings.semver.semverMod.^ = js.native
    
    def test(version: String): Boolean = js.native
    def test(version: typings.semver.semverMod.^): Boolean = js.native
    
    var value: String = js.native
  }
}
