package typings.snykCliInterface

import typings.snykCliInterface.commonMod.SupportedPackageManagers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object snykCliInterfaceStrings {
  @js.native
  sealed trait apk extends SupportedPackageManagers
  
  @js.native
  sealed trait composer extends SupportedPackageManagers
  
  @js.native
  sealed trait deb extends SupportedPackageManagers
  
  @js.native
  sealed trait dockerfile extends SupportedPackageManagers
  
  @js.native
  sealed trait golangdep extends SupportedPackageManagers
  
  @js.native
  sealed trait gomodules extends SupportedPackageManagers
  
  @js.native
  sealed trait govendor extends SupportedPackageManagers
  
  @js.native
  sealed trait gradle extends SupportedPackageManagers
  
  @js.native
  sealed trait maven extends SupportedPackageManagers
  
  @js.native
  sealed trait npm extends SupportedPackageManagers
  
  @js.native
  sealed trait nuget extends SupportedPackageManagers
  
  @js.native
  sealed trait paket extends SupportedPackageManagers
  
  @js.native
  sealed trait pip extends SupportedPackageManagers
  
  @js.native
  sealed trait rpm extends SupportedPackageManagers
  
  @js.native
  sealed trait rubygems extends SupportedPackageManagers
  
  @js.native
  sealed trait sbt extends SupportedPackageManagers
  
  @js.native
  sealed trait yarn extends SupportedPackageManagers
  
  @scala.inline
  def apk: apk = "apk".asInstanceOf[apk]
  @scala.inline
  def composer: composer = "composer".asInstanceOf[composer]
  @scala.inline
  def deb: deb = "deb".asInstanceOf[deb]
  @scala.inline
  def dockerfile: dockerfile = "dockerfile".asInstanceOf[dockerfile]
  @scala.inline
  def golangdep: golangdep = "golangdep".asInstanceOf[golangdep]
  @scala.inline
  def gomodules: gomodules = "gomodules".asInstanceOf[gomodules]
  @scala.inline
  def govendor: govendor = "govendor".asInstanceOf[govendor]
  @scala.inline
  def gradle: gradle = "gradle".asInstanceOf[gradle]
  @scala.inline
  def maven: maven = "maven".asInstanceOf[maven]
  @scala.inline
  def npm: npm = "npm".asInstanceOf[npm]
  @scala.inline
  def nuget: nuget = "nuget".asInstanceOf[nuget]
  @scala.inline
  def paket: paket = "paket".asInstanceOf[paket]
  @scala.inline
  def pip: pip = "pip".asInstanceOf[pip]
  @scala.inline
  def rpm: rpm = "rpm".asInstanceOf[rpm]
  @scala.inline
  def rubygems: rubygems = "rubygems".asInstanceOf[rubygems]
  @scala.inline
  def sbt: sbt = "sbt".asInstanceOf[sbt]
  @scala.inline
  def yarn: yarn = "yarn".asInstanceOf[yarn]
}

