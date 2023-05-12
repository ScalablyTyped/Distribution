package typings.sigstore

import typings.sigstore.distErrorMod.InternalErrorCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sigstoreStrings {
  
  @js.native
  sealed trait `0Dot0Dot1` extends StObject
  inline def `0Dot0Dot1`: `0Dot0Dot1` = "0.0.1".asInstanceOf[`0Dot0Dot1`]
  
  @js.native
  sealed trait `0Dot0Dot2` extends StObject
  inline def `0Dot0Dot2`: `0Dot0Dot2` = "0.0.2".asInstanceOf[`0Dot0Dot2`]
  
  @js.native
  sealed trait CA_CREATE_SIGNING_CERTIFICATE_ERROR
    extends StObject
       with InternalErrorCode
  inline def CA_CREATE_SIGNING_CERTIFICATE_ERROR: CA_CREATE_SIGNING_CERTIFICATE_ERROR = "CA_CREATE_SIGNING_CERTIFICATE_ERROR".asInstanceOf[CA_CREATE_SIGNING_CERTIFICATE_ERROR]
  
  @js.native
  sealed trait TLOG_CREATE_ENTRY_ERROR
    extends StObject
       with InternalErrorCode
  inline def TLOG_CREATE_ENTRY_ERROR: TLOG_CREATE_ENTRY_ERROR = "TLOG_CREATE_ENTRY_ERROR".asInstanceOf[TLOG_CREATE_ENTRY_ERROR]
  
  @js.native
  sealed trait TLOG_FETCH_ENTRY_ERROR
    extends StObject
       with InternalErrorCode
  inline def TLOG_FETCH_ENTRY_ERROR: TLOG_FETCH_ENTRY_ERROR = "TLOG_FETCH_ENTRY_ERROR".asInstanceOf[TLOG_FETCH_ENTRY_ERROR]
  
  @js.native
  sealed trait TUF_DOWNLOAD_TARGET_ERROR
    extends StObject
       with InternalErrorCode
  inline def TUF_DOWNLOAD_TARGET_ERROR: TUF_DOWNLOAD_TARGET_ERROR = "TUF_DOWNLOAD_TARGET_ERROR".asInstanceOf[TUF_DOWNLOAD_TARGET_ERROR]
  
  @js.native
  sealed trait TUF_FIND_TARGET_ERROR
    extends StObject
       with InternalErrorCode
  inline def TUF_FIND_TARGET_ERROR: TUF_FIND_TARGET_ERROR = "TUF_FIND_TARGET_ERROR".asInstanceOf[TUF_FIND_TARGET_ERROR]
  
  @js.native
  sealed trait TUF_READ_TARGET_ERROR
    extends StObject
       with InternalErrorCode
  inline def TUF_READ_TARGET_ERROR: TUF_READ_TARGET_ERROR = "TUF_READ_TARGET_ERROR".asInstanceOf[TUF_READ_TARGET_ERROR]
  
  @js.native
  sealed trait TUF_REFRESH_METADATA_ERROR
    extends StObject
       with InternalErrorCode
  inline def TUF_REFRESH_METADATA_ERROR: TUF_REFRESH_METADATA_ERROR = "TUF_REFRESH_METADATA_ERROR".asInstanceOf[TUF_REFRESH_METADATA_ERROR]
  
  @js.native
  sealed trait certificateIdentities extends StObject
  inline def certificateIdentities: certificateIdentities = "certificateIdentities".asInstanceOf[certificateIdentities]
  
  @js.native
  sealed trait dsseEnvelope extends StObject
  inline def dsseEnvelope: dsseEnvelope = "dsseEnvelope".asInstanceOf[dsseEnvelope]
  
  @js.native
  sealed trait messageSignature extends StObject
  inline def messageSignature: messageSignature = "messageSignature".asInstanceOf[messageSignature]
  
  @js.native
  sealed trait sha256 extends StObject
  inline def sha256: sha256 = "sha256".asInstanceOf[sha256]
  
  @js.native
  sealed trait x509CertificateChain extends StObject
  inline def x509CertificateChain: x509CertificateChain = "x509CertificateChain".asInstanceOf[x509CertificateChain]
}
