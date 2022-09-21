package typings.ramlTypesystem.typesystemMod

import typings.ramlTypesystem.typesystemInterfacesMod.IStatus
import typings.ramlTypesystem.typesystemInterfacesMod.RangeObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("raml-typesystem/dist/src/typesystem", "Status")
@js.native
open class Status protected ()
  extends StObject
     with IStatus {
  def this(severity: Double, code: String, message: String, source: Any) = this()
  def this(severity: Double, code: String, message: String, source: Any, takeNodeFromSource: Boolean) = this()
  
  def addSubStatus(st: IStatus): Unit = js.native
  def addSubStatus(st: IStatus, pathName: String): Unit = js.native
  
  /* protected */ var code: String = js.native
  
  /* protected */ var filePath: String = js.native
  
  /**
    * Unique identifier
    */
  /* CompleteClass */
  override def getCode(): String = js.native
  
  /**
    * returns primitive error statuses gathered recurrently, returns warnings to.
    */
  /* CompleteClass */
  override def getErrors(): js.Array[IStatus] = js.native
  
  /* CompleteClass */
  override def getExtra(name: String): Any = js.native
  
  /* CompleteClass */
  override def getFilePath(): String = js.native
  
  /* CompleteClass */
  override def getInternalPath(): typings.ramlTypesystem.typesystemInterfacesMod.IValidationPath = js.native
  
  /* CompleteClass */
  override def getInternalRange(): RangeObject = js.native
  
  /**
    * returns human readable message associated with this status
    */
  /* CompleteClass */
  override def getMessage(): String = js.native
  
  /* CompleteClass */
  override def getSeverity(): Double = js.native
  
  /**
    * return an object which raised this status
    */
  /* CompleteClass */
  override def getSource(): Any = js.native
  
  /**
    * returns an array of nested statuses
    */
  /* CompleteClass */
  override def getSubStatuses(): js.Array[IStatus] = js.native
  
  /* CompleteClass */
  override def getValidationPath(): typings.ramlTypesystem.typesystemInterfacesMod.IValidationPath = js.native
  
  /**
    * returns path to this status
    */
  /* CompleteClass */
  override def getValidationPathAsString(): String = js.native
  
  /* protected */ var internalPath: typings.ramlTypesystem.typesystemInterfacesMod.IValidationPath = js.native
  
  /* protected */ var internalRange: RangeObject = js.native
  
  /**
    * return true if this status contains a error
    */
  /* CompleteClass */
  override def isError(): Boolean = js.native
  
  /**
    * return true if this status is just information
    */
  /* CompleteClass */
  override def isInfo(): Boolean = js.native
  
  /**
    * returns true if status does not have errors
    */
  /* CompleteClass */
  override def isOk(): Boolean = js.native
  
  /**
    * return true if this status contains a warning
    */
  /* CompleteClass */
  override def isWarning(): Boolean = js.native
  
  /* protected */ var message: String = js.native
  
  /* CompleteClass */
  override def putExtra(name: String, value: Any): Unit = js.native
  
  /* CompleteClass */
  override def setCode(c: String): Unit = js.native
  
  def setFilePath(filePath: String): Unit = js.native
  
  def setInternalPath(ip: typings.ramlTypesystem.typesystemInterfacesMod.IValidationPath): Unit = js.native
  
  def setInternalRange(range: RangeObject): Unit = js.native
  
  /* CompleteClass */
  override def setMessage(m: String): Unit = js.native
  
  def setSource(s: Any): Unit = js.native
  
  /* CompleteClass */
  override def setValidationPath(p: typings.ramlTypesystem.typesystemInterfacesMod.IValidationPath): Unit = js.native
  
  /* protected */ var severity: Double = js.native
  
  /* protected */ var source: Any = js.native
  
  /* protected */ var subStatus: js.Array[IStatus] = js.native
  
  /* private */ var takeNodeFromSource: Any = js.native
  
  /* protected */ var vp: typings.ramlTypesystem.typesystemInterfacesMod.IValidationPath = js.native
}
/* static members */
object Status {
  
  @JSImport("raml-typesystem/dist/src/typesystem", "Status")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("raml-typesystem/dist/src/typesystem", "Status.CODE_CONFLICTING_TYPE_KIND")
  @js.native
  def CODE_CONFLICTING_TYPE_KIND: Double = js.native
  inline def CODE_CONFLICTING_TYPE_KIND_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CODE_CONFLICTING_TYPE_KIND")(x.asInstanceOf[js.Any])
  
  @JSImport("raml-typesystem/dist/src/typesystem", "Status.CODE_INCORRECT_DISCRIMINATOR")
  @js.native
  def CODE_INCORRECT_DISCRIMINATOR: Any = js.native
  inline def CODE_INCORRECT_DISCRIMINATOR_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CODE_INCORRECT_DISCRIMINATOR")(x.asInstanceOf[js.Any])
  
  @JSImport("raml-typesystem/dist/src/typesystem", "Status.CODE_MISSING_DISCRIMINATOR")
  @js.native
  def CODE_MISSING_DISCRIMINATOR: Any = js.native
  inline def CODE_MISSING_DISCRIMINATOR_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CODE_MISSING_DISCRIMINATOR")(x.asInstanceOf[js.Any])
  
  @JSImport("raml-typesystem/dist/src/typesystem", "Status.ERROR")
  @js.native
  def ERROR: Double = js.native
  inline def ERROR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(x.asInstanceOf[js.Any])
  
  @JSImport("raml-typesystem/dist/src/typesystem", "Status.INFO")
  @js.native
  def INFO: Double = js.native
  inline def INFO_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INFO")(x.asInstanceOf[js.Any])
  
  @JSImport("raml-typesystem/dist/src/typesystem", "Status.OK")
  @js.native
  def OK: Double = js.native
  inline def OK_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OK")(x.asInstanceOf[js.Any])
  
  @JSImport("raml-typesystem/dist/src/typesystem", "Status.WARNING")
  @js.native
  def WARNING: Double = js.native
  inline def WARNING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WARNING")(x.asInstanceOf[js.Any])
}
