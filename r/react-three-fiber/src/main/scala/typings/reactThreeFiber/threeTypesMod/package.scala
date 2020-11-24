package typings.reactThreeFiber

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object threeTypesMod {
  
  type AmbientLightProbeProps = typings.reactThreeFiber.threeTypesMod.LightNode[
    typings.three.mod.AmbientLightProbe, 
    org.scalablytyped.runtime.Instantiable0[typings.three.mod.AmbientLightProbe]
  ]
  
  type AmbientLightProps = typings.reactThreeFiber.threeTypesMod.LightNode[
    typings.three.mod.AmbientLight, 
    org.scalablytyped.runtime.Instantiable0[typings.three.mod.AmbientLight]
  ]
  
  type Args[T] = T | typings.std.ConstructorParameters[T]
  
  type ArrayCameraProps = typings.reactThreeFiber.threeTypesMod.Object3DNode[
    typings.three.mod.ArrayCamera, 
    org.scalablytyped.runtime.Instantiable0[typings.three.mod.ArrayCamera]
  ]
  
  type ArrowHelperProps = typings.reactThreeFiber.threeTypesMod.Object3DNode[
    typings.three.mod.ArrowHelper, 
    org.scalablytyped.runtime.Instantiable6[
      /* dir */ typings.three.vector3Mod.Vector3, 
      /* origin */ js.UndefOr[typings.three.vector3Mod.Vector3], 
      /* length */ js.UndefOr[scala.Double], 
      /* color */ js.UndefOr[typings.three.colorMod.Color | java.lang.String | scala.Double], 
      /* headLength */ js.UndefOr[scala.Double], 
      /* headWidth */ js.UndefOr[scala.Double], 
      typings.three.mod.ArrowHelper
    ]
  ]
  
  type AudioListenerProps = typings.reactThreeFiber.threeTypesMod.Object3DNode[
    typings.three.mod.AudioListener, 
    org.scalablytyped.runtime.Instantiable0[typings.three.mod.AudioListener]
  ]
  
  type AxesHelperProps = typings.reactThreeFiber.threeTypesMod.Object3DNode[
    typings.three.mod.AxesHelper, 
    org.scalablytyped.runtime.Instantiable0[typings.three.mod.AxesHelper]
  ]
  
  type BoneProps = typings.reactThreeFiber.threeTypesMod.Object3DNode[
    typings.three.mod.Bone, 
    org.scalablytyped.runtime.Instantiable0[typings.three.mod.Bone]
  ]
  
  type Box3HelperProps = typings.reactThreeFiber.threeTypesMod.Object3DNode[
    typings.three.mod.Box3Helper, 
    org.scalablytyped.runtime.Instantiable1[/* box */ typings.three.box3Mod.Box3, typings.three.mod.Box3Helper]
  ]
  
  type BoxBufferGeometryProps = typings.reactThreeFiber.threeTypesMod.BufferGeometryNode[
    typings.three.mod.BoxBufferGeometry, 
    org.scalablytyped.runtime.Instantiable6[
      /* width */ js.UndefOr[scala.Double], 
      /* height */ js.UndefOr[scala.Double], 
      /* depth */ js.UndefOr[scala.Double], 
      /* widthSegments */ js.UndefOr[scala.Double], 
      /* heightSegments */ js.UndefOr[scala.Double], 
      /* depthSegments */ js.UndefOr[scala.Double], 
      typings.three.mod.BoxBufferGeometry
    ]
  ]
  
  type BoxGeometryProps = typings.reactThreeFiber.threeTypesMod.GeometryNode[
    typings.three.mod.BoxGeometry, 
    org.scalablytyped.runtime.Instantiable6[
      /* width */ js.UndefOr[scala.Double], 
      /* height */ js.UndefOr[scala.Double], 
      /* depth */ js.UndefOr[scala.Double], 
      /* widthSegments */ js.UndefOr[scala.Double], 
      /* heightSegments */ js.UndefOr[scala.Double], 
      /* depthSegments */ js.UndefOr[scala.Double], 
      typings.three.mod.BoxGeometry
    ]
  ]
  
  type BoxHelperProps = typings.reactThreeFiber.threeTypesMod.Object3DNode[
    typings.three.mod.BoxHelper, 
    org.scalablytyped.runtime.Instantiable1[/* object */ typings.three.object3DMod.Object3D, typings.three.mod.BoxHelper]
  ]
  
  type BufferAttributeProps = typings.reactThreeFiber.threeTypesMod.Node[
    typings.three.mod.BufferAttribute, 
    org.scalablytyped.runtime.Instantiable2[
      /* array */ typings.std.ArrayLike[scala.Double], 
      /* itemSize */ scala.Double, 
      typings.three.mod.BufferAttribute
    ]
  ]
  
  type BufferGeometryNode[T /* <: typings.three.mod.BufferGeometry */, P] = typings.reactThreeFiber.threeTypesMod.Overwrite[typings.reactThreeFiber.threeTypesMod.Node[T, P], js.Object]
  
  type BufferGeometryProps = typings.reactThreeFiber.threeTypesMod.BufferGeometryNode[
    typings.three.mod.BufferGeometry, 
    typings.reactThreeFiber.anon.TypeofBufferGeometry
  ]
  
  type CameraHelperProps = typings.reactThreeFiber.threeTypesMod.Object3DNode[
    typings.three.mod.CameraHelper, 
    org.scalablytyped.runtime.Instantiable1[/* camera */ typings.three.cameraMod.Camera, typings.three.mod.CameraHelper]
  ]
  
  type CameraProps = typings.reactThreeFiber.threeTypesMod.Object3DNode[
    typings.three.mod.Camera, 
    org.scalablytyped.runtime.Instantiable0[typings.three.mod.Camera]
  ]
  
  type CanvasTextureProps = typings.reactThreeFiber.threeTypesMod.Node[
    typings.three.mod.CanvasTexture, 
    org.scalablytyped.runtime.Instantiable9[
      /* canvas */ typings.std.HTMLImageElement | typings.std.HTMLCanvasElement | typings.std.HTMLVideoElement, 
      /* mapping */ js.UndefOr[typings.three.constantsMod.Mapping], 
      /* wrapS */ js.UndefOr[typings.three.constantsMod.Wrapping], 
      /* wrapT */ js.UndefOr[typings.three.constantsMod.Wrapping], 
      /* magFilter */ js.UndefOr[typings.three.constantsMod.TextureFilter], 
      /* minFilter */ js.UndefOr[typings.three.constantsMod.TextureFilter], 
      /* format */ js.UndefOr[typings.three.constantsMod.PixelFormat], 
      /* type */ js.UndefOr[typings.three.constantsMod.TextureDataType], 
      /* anisotropy */ js.UndefOr[scala.Double], 
      typings.three.mod.CanvasTexture
    ]
  ]
  
  type CircleBufferGeometryProps = typings.reactThreeFiber.threeTypesMod.BufferGeometryNode[
    typings.three.mod.CircleBufferGeometry, 
    org.scalablytyped.runtime.Instantiable0[typings.three.mod.CircleBufferGeometry]
  ]
  
  type CircleGeometryProps = typings.reactThreeFiber.threeTypesMod.GeometryNode[
    typings.three.mod.CircleGeometry, 
    org.scalablytyped.runtime.Instantiable0[typings.three.mod.CircleGeometry]
  ]
  
  type Color = typings.three.mod.Color | scala.Double | java.lang.String
  
  type ColorProps = typings.reactThreeFiber.threeTypesMod.Node[typings.three.mod.Color, typings.reactThreeFiber.anon.TypeofColor]
  
  type CompressedTextureProps = typings.reactThreeFiber.threeTypesMod.Node[
    typings.three.mod.CompressedTexture, 
    org.scalablytyped.runtime.Instantiable12[
      /* mipmaps */ js.Array[typings.std.ImageData], 
      /* width */ scala.Double, 
      /* height */ scala.Double, 
      /* format */ js.UndefOr[typings.three.constantsMod.CompressedPixelFormat], 
      /* type */ js.UndefOr[typings.three.constantsMod.TextureDataType], 
      /* mapping */ js.UndefOr[typings.three.constantsMod.Mapping], 
      /* wrapS */ js.UndefOr[typings.three.constantsMod.Wrapping], 
      /* wrapT */ js.UndefOr[typings.three.constantsMod.Wrapping], 
      /* magFilter */ js.UndefOr[typings.three.constantsMod.TextureFilter], 
      /* minFilter */ js.UndefOr[typings.three.constantsMod.TextureFilter], 
      /* anisotropy */ js.UndefOr[scala.Double], 
      /* encoding */ js.UndefOr[typings.three.constantsMod.TextureEncoding], 
      typings.three.mod.CompressedTexture
    ]
  ]
  
  type ConeBufferGeometryProps = typings.reactThreeFiber.threeTypesMod.BufferGeometryNode[
    typings.three.mod.ConeBufferGeometry, 
    org.scalablytyped.runtime.Instantiable7[
      /* radius */ js.UndefOr[scala.Double], 
      /* height */ js.UndefOr[scala.Double], 
      /* radialSegments */ js.UndefOr[scala.Double], 
      /* heightSegments */ js.UndefOr[scala.Double], 
      /* openEnded */ js.UndefOr[scala.Boolean], 
      /* thetaStart */ js.UndefOr[scala.Double], 
      /* thetaLength */ js.UndefOr[scala.Double], 
      typings.three.mod.ConeBufferGeometry
    ]
  ]
  
  type ConeGeometryProps = typings.reactThreeFiber.threeTypesMod.GeometryNode[
    typings.three.mod.ConeGeometry, 
    org.scalablytyped.runtime.Instantiable7[
      /* radius */ js.UndefOr[scala.Double], 
      /* height */ js.UndefOr[scala.Double], 
      /* radialSegments */ js.UndefOr[scala.Double], 
      /* heightSegments */ js.UndefOr[scala.Double], 
      /* openEnded */ js.UndefOr[scala.Boolean], 
      /* thetaStart */ js.UndefOr[scala.Double], 
      /* thetaLength */ js.UndefOr[scala.Double], 
      typings.three.mod.ConeGeometry
    ]
  ]
  
  type CubeCameraProps = typings.reactThreeFiber.threeTypesMod.Object3DNode[
    typings.three.mod.CubeCamera, 
    org.scalablytyped.runtime.Instantiable3[
      /* near */ scala.Double, 
      /* far */ scala.Double, 
      /* renderTarget */ typings.three.webGLCubeRenderTargetMod.WebGLCubeRenderTarget, 
      typings.three.mod.CubeCamera
    ]
  ]
  
  type CubeTextureProps = typings.reactThreeFiber.threeTypesMod.Node[
    typings.three.mod.CubeTexture, 
    org.scalablytyped.runtime.Instantiable10[
      /* images */ js.UndefOr[js.Array[js.Any]], 
      /* mapping */ js.UndefOr[typings.three.constantsMod.Mapping], 
      /* wrapS */ js.UndefOr[typings.three.constantsMod.Wrapping], 
      /* wrapT */ js.UndefOr[typings.three.constantsMod.Wrapping], 
      /* magFilter */ js.UndefOr[typings.three.constantsMod.TextureFilter], 
      /* minFilter */ js.UndefOr[typings.three.constantsMod.TextureFilter], 
      /* format */ js.UndefOr[typings.three.constantsMod.PixelFormat], 
      /* type */ js.UndefOr[typings.three.constantsMod.TextureDataType], 
      /* anisotropy */ js.UndefOr[scala.Double], 
      /* encoding */ js.UndefOr[typings.three.constantsMod.TextureEncoding], 
      typings.three.mod.CubeTexture
    ]
  ]
  
  type CylinderBufferGeometryProps = typings.reactThreeFiber.threeTypesMod.BufferGeometryNode[
    typings.three.mod.CylinderBufferGeometry, 
    org.scalablytyped.runtime.Instantiable8[
      /* radiusTop */ js.UndefOr[scala.Double], 
      /* radiusBottom */ js.UndefOr[scala.Double], 
      /* height */ js.UndefOr[scala.Double], 
      /* radialSegments */ js.UndefOr[scala.Double], 
      /* heightSegments */ js.UndefOr[scala.Double], 
      /* openEnded */ js.UndefOr[scala.Boolean], 
      /* thetaStart */ js.UndefOr[scala.Double], 
      /* thetaLength */ js.UndefOr[scala.Double], 
      typings.three.mod.CylinderBufferGeometry
    ]
  ]
  
  type CylinderGeometryProps = typings.reactThreeFiber.threeTypesMod.GeometryNode[
    typings.three.mod.CylinderGeometry, 
    org.scalablytyped.runtime.Instantiable8[
      /* radiusTop */ js.UndefOr[scala.Double], 
      /* radiusBottom */ js.UndefOr[scala.Double], 
      /* height */ js.UndefOr[scala.Double], 
      /* radialSegments */ js.UndefOr[scala.Double], 
      /* heightSegments */ js.UndefOr[scala.Double], 
      /* openEnded */ js.UndefOr[scala.Boolean], 
      /* thetaStart */ js.UndefOr[scala.Double], 
      /* thetaLength */ js.UndefOr[scala.Double], 
      typings.three.mod.CylinderGeometry
    ]
  ]
  
  type DataTexture3DProps = typings.reactThreeFiber.threeTypesMod.Node[
    typings.three.mod.DataTexture3D, 
    org.scalablytyped.runtime.Instantiable4[
      /* data */ typings.three.polyfillsMod.TypedArray, 
      /* width */ scala.Double, 
      /* height */ scala.Double, 
      /* depth */ scala.Double, 
      typings.three.mod.DataTexture3D
    ]
  ]
  
  type DataTextureProps = typings.reactThreeFiber.threeTypesMod.Node[
    typings.three.mod.DataTexture, 
    org.scalablytyped.runtime.Instantiable12[
      /* data */ typings.three.polyfillsMod.TypedArray, 
      /* width */ scala.Double, 
      /* height */ scala.Double, 
      /* format */ js.UndefOr[typings.three.constantsMod.PixelFormat], 
      /* type */ js.UndefOr[typings.three.constantsMod.TextureDataType], 
      /* mapping */ js.UndefOr[typings.three.constantsMod.Mapping], 
      /* wrapS */ js.UndefOr[typings.three.constantsMod.Wrapping], 
      /* wrapT */ js.UndefOr[typings.three.constantsMod.Wrapping], 
      /* magFilter */ js.UndefOr[typings.three.constantsMod.TextureFilter], 
      /* minFilter */ js.UndefOr[typings.three.constantsMod.TextureFilter], 
      /* anisotropy */ js.UndefOr[scala.Double], 
      /* encoding */ js.UndefOr[typings.three.constantsMod.TextureEncoding], 
      typings.three.mod.DataTexture
    ]
  ]
  
  type DepthTextureProps = typings.reactThreeFiber.threeTypesMod.Node[
    typings.three.mod.DepthTexture, 
    org.scalablytyped.runtime.Instantiable9[
      /* width */ scala.Double, 
      /* height */ scala.Double, 
      /* type */ js.UndefOr[typings.three.constantsMod.TextureDataType], 
      /* mapping */ js.UndefOr[typings.three.constantsMod.Mapping], 
      /* wrapS */ js.UndefOr[typings.three.constantsMod.Wrapping], 
      /* wrapT */ js.UndefOr[typings.three.constantsMod.Wrapping], 
      /* magFilter */ js.UndefOr[typings.three.constantsMod.TextureFilter], 
      /* minFilter */ js.UndefOr[typings.three.constantsMod.TextureFilter], 
      /* anisotropy */ js.UndefOr[scala.Double], 
      typings.three.mod.DepthTexture
    ]
  ]
  
  type DirectionalLightHelperProps = typings.reactThreeFiber.threeTypesMod.Object3DNode[
    typings.three.mod.DirectionalLightHelper, 
    org.scalablytyped.runtime.Instantiable1[
      /* light */ typings.three.directionalLightMod.DirectionalLight, 
      typings.three.mod.DirectionalLightHelper
    ]
  ]
  
  type DirectionalLightProps = typings.reactThreeFiber.threeTypesMod.LightNode[
    typings.three.mod.DirectionalLight, 
    org.scalablytyped.runtime.Instantiable0[typings.three.mod.DirectionalLight]
  ]
  
  type DirectionalLightShadowProps = typings.reactThreeFiber.threeTypesMod.Node[
    typings.three.mod.DirectionalLightShadow, 
    org.scalablytyped.runtime.Instantiable0[typings.three.mod.DirectionalLightShadow]
  ]
  
  type DodecahedronBufferGeometryProps = typings.reactThreeFiber.threeTypesMod.BufferGeometryNode[
    typings.three.mod.DodecahedronBufferGeometry, 
    org.scalablytyped.runtime.Instantiable0[typings.three.mod.DodecahedronBufferGeometry]
  ]
  
  type DodecahedronGeometryProps = typings.reactThreeFiber.threeTypesMod.GeometryNode[
    typings.three.mod.DodecahedronGeometry, 
    org.scalablytyped.runtime.Instantiable0[typings.three.mod.DodecahedronGeometry]
  ]
  
  type EdgesGeometryProps = typings.reactThreeFiber.threeTypesMod.BufferGeometryNode[
    typings.three.mod.EdgesGeometry, 
    org.scalablytyped.runtime.Instantiable1[
      /* geometry */ typings.three.bufferGeometryMod.BufferGeometry, 
      typings.three.mod.EdgesGeometry
    ]
  ]
  
  type Euler = typings.three.mod.Euler | typings.std.Parameters[typings.reactThreeFiber.anon.FnCall]
  
  type EulerProps = typings.reactThreeFiber.threeTypesMod.Node[typings.three.mod.Euler, typings.reactThreeFiber.anon.TypeofEuler]
  
  type ExtrudeBufferGeometryProps = typings.reactThreeFiber.threeTypesMod.BufferGeometryNode[
    typings.three.mod.ExtrudeBufferGeometry, 
    org.scalablytyped.runtime.Instantiable1[/* shapes */ typings.three.shapeMod.Shape, typings.three.mod.ExtrudeBufferGeometry]
  ]
  
  type ExtrudeGeometryProps = typings.reactThreeFiber.threeTypesMod.GeometryNode[
    typings.three.mod.ExtrudeGeometry, 
    org.scalablytyped.runtime.Instantiable1[/* shapes */ typings.three.shapeMod.Shape, typings.three.mod.ExtrudeGeometry]
  ]
  
  type Face3Props = typings.reactThreeFiber.threeTypesMod.Node[
    typings.three.mod.Face3, 
    org.scalablytyped.runtime.Instantiable3[
      /* a */ scala.Double, 
      /* b */ scala.Double, 
      /* c */ scala.Double, 
      typings.three.mod.Face3
    ]
  ]
  
  type FogProps = typings.reactThreeFiber.threeTypesMod.Node[
    typings.three.mod.Fog, 
    org.scalablytyped.runtime.Instantiable1[/* color */ typings.three.colorMod.Color, typings.three.mod.Fog]
  ]
  
  type GeometryNode[T /* <: typings.three.mod.Geometry */, P] = typings.reactThreeFiber.threeTypesMod.Overwrite[
    typings.reactThreeFiber.threeTypesMod.Node[T, P], 
    typings.reactThreeFiber.anon.Vertices
  ]
  
  type GeometryProps = typings.reactThreeFiber.threeTypesMod.GeometryNode[
    typings.three.mod.Geometry, 
    org.scalablytyped.runtime.Instantiable0[typings.three.mod.Geometry]
  ]
  
  type GridHelperProps = typings.reactThreeFiber.threeTypesMod.Object3DNode[
    typings.three.mod.GridHelper, 
    org.scalablytyped.runtime.Instantiable4[
      /* size */ js.UndefOr[scala.Double], 
      /* divisions */ js.UndefOr[scala.Double], 
      /* color1 */ js.UndefOr[typings.three.colorMod.Color | java.lang.String | scala.Double], 
      /* color2 */ js.UndefOr[typings.three.colorMod.Color | java.lang.String | scala.Double], 
      typings.three.mod.GridHelper
    ]
  ]
  
  type GroupProps = typings.reactThreeFiber.threeTypesMod.Object3DNode[
    typings.three.mod.Group, 
    org.scalablytyped.runtime.Instantiable0[typings.three.mod.Group]
  ]
  
  type HemisphereLightHelperProps = typings.reactThreeFiber.threeTypesMod.Object3DNode[
    typings.three.mod.HemisphereLightHelper, 
    org.scalablytyped.runtime.Instantiable2[
      /* light */ typings.three.hemisphereLightMod.HemisphereLight, 
      /* size */ scala.Double, 
      typings.three.mod.HemisphereLightHelper
    ]
  ]
  
  type HemisphereLightProbeProps = typings.reactThreeFiber.threeTypesMod.LightNode[
    typings.three.mod.HemisphereLightProbe, 
    org.scalablytyped.runtime.Instantiable0[typings.three.mod.HemisphereLightProbe]
  ]
  
  type HemisphereLightProps = typings.reactThreeFiber.threeTypesMod.LightNode[
    typings.three.mod.HemisphereLight, 
    org.scalablytyped.runtime.Instantiable0[typings.three.mod.HemisphereLight]
  ]
  
  type IcosahedronBufferGeometryProps = typings.reactThreeFiber.threeTypesMod.BufferGeometryNode[
    typings.three.mod.IcosahedronBufferGeometry, 
    org.scalablytyped.runtime.Instantiable0[typings.three.mod.IcosahedronBufferGeometry]
  ]
  
  type IcosahedronGeometryProps = typings.reactThreeFiber.threeTypesMod.GeometryNode[
    typings.three.mod.IcosahedronGeometry, 
    org.scalablytyped.runtime.Instantiable0[typings.three.mod.IcosahedronGeometry]
  ]
  
  type ImmediateRenderObjectProps = typings.reactThreeFiber.threeTypesMod.Object3DNode[
    typings.three.mod.ImmediateRenderObject, 
    org.scalablytyped.runtime.Instantiable1[
      /* material */ typings.three.materialMod.Material, 
      typings.three.mod.ImmediateRenderObject
    ]
  ]
  
  type InstancedBufferAttributeProps = typings.reactThreeFiber.threeTypesMod.Node[
    typings.three.mod.InstancedBufferAttribute, 
    org.scalablytyped.runtime.Instantiable2[
      /* array */ typings.std.ArrayLike[scala.Double], 
      /* itemSize */ scala.Double, 
      typings.three.mod.InstancedBufferAttribute
    ]
  ]
  
  type InstancedBufferGeometryProps = typings.reactThreeFiber.threeTypesMod.BufferGeometryNode[
    typings.three.mod.InstancedBufferGeometry, 
    org.scalablytyped.runtime.Instantiable0[typings.three.mod.InstancedBufferGeometry]
  ]
  
  type InstancedMeshProps = typings.reactThreeFiber.threeTypesMod.Object3DNode[
    typings.three.mod.InstancedMesh[
      typings.three.geometryMod.Geometry | typings.three.bufferGeometryMod.BufferGeometry, 
      typings.three.materialMod.Material | js.Array[typings.three.materialMod.Material]
    ], 
    org.scalablytyped.runtime.Instantiable3[
      /* import warning: RewrittenClass.unapply cls was tparam TGeometry */ /* geometry */ js.Any, 
      /* import warning: RewrittenClass.unapply cls was tparam TMaterial */ /* material */ js.Any, 
      /* count */ scala.Double, 
      typings.three.mod.InstancedMesh[
        typings.three.geometryMod.Geometry | typings.three.bufferGeometryMod.BufferGeometry, 
        typings.three.materialMod.Material | js.Array[typings.three.materialMod.Material]
      ]
    ]
  ]
  
  type LODProps = typings.reactThreeFiber.threeTypesMod.Object3DNode[
    typings.three.mod.LOD, 
    org.scalablytyped.runtime.Instantiable0[typings.three.mod.LOD]
  ]
  
  type LatheBufferGeometryProps = typings.reactThreeFiber.threeTypesMod.BufferGeometryNode[
    typings.three.mod.LatheBufferGeometry, 
    org.scalablytyped.runtime.Instantiable1[
      /* points */ js.Array[typings.three.vector2Mod.Vector2], 
      typings.three.mod.LatheBufferGeometry
    ]
  ]
  
  type LatheGeometryProps = typings.reactThreeFiber.threeTypesMod.GeometryNode[
    typings.three.mod.LatheGeometry, 
    org.scalablytyped.runtime.Instantiable1[
      /* points */ js.Array[typings.three.vector2Mod.Vector2], 
      typings.three.mod.LatheGeometry
    ]
  ]
  
  type Layers = typings.three.mod.Layers | (typings.std.Parameters[js.Function1[/* channel */ scala.Double, scala.Unit]])
  
  type LightNode[T /* <: typings.three.mod.Light */, P] = typings.reactThreeFiber.threeTypesMod.Overwrite[
    typings.reactThreeFiber.threeTypesMod.Object3DNode[T, P], 
    typings.reactThreeFiber.anon.Color
  ]
  
  type LightProbeProps = typings.reactThreeFiber.threeTypesMod.LightNode[
    typings.three.mod.LightProbe, 
    org.scalablytyped.runtime.Instantiable0[typings.three.mod.LightProbe]
  ]
  
  type LightProps = typings.reactThreeFiber.threeTypesMod.LightNode[
    typings.three.mod.Light, 
    org.scalablytyped.runtime.Instantiable0[typings.three.mod.Light]
  ]
  
  type LightShadowProps = typings.reactThreeFiber.threeTypesMod.Node[
    typings.three.mod.LightShadow, 
    org.scalablytyped.runtime.Instantiable1[/* camera */ typings.three.cameraMod.Camera, typings.three.mod.LightShadow]
  ]
  
  type LineBasicMaterialProps = typings.reactThreeFiber.threeTypesMod.MaterialNode[
    typings.three.mod.LineBasicMaterial, 
    js.Array[typings.three.lineBasicMaterialMod.LineBasicMaterialParameters]
  ]
  
  type LineDashedMaterialProps = typings.reactThreeFiber.threeTypesMod.MaterialNode[
    typings.three.mod.LineDashedMaterial, 
    js.Array[typings.three.lineDashedMaterialMod.LineDashedMaterialParameters]
  ]
  
  type LineLoopProps = typings.reactThreeFiber.threeTypesMod.Object3DNode[
    typings.three.mod.LineLoop[
      typings.three.geometryMod.Geometry | typings.three.bufferGeometryMod.BufferGeometry, 
      typings.three.materialMod.Material | js.Array[typings.three.materialMod.Material]
    ], 
    org.scalablytyped.runtime.Instantiable0[
      typings.three.mod.LineLoop[
        typings.three.geometryMod.Geometry | typings.three.bufferGeometryMod.BufferGeometry, 
        typings.three.materialMod.Material | js.Array[typings.three.materialMod.Material]
      ]
    ]
  ]
  
  type LineSegmentsProps = typings.reactThreeFiber.threeTypesMod.Object3DNode[
    typings.three.mod.LineSegments[
      typings.three.geometryMod.Geometry | typings.three.bufferGeometryMod.BufferGeometry, 
      typings.three.materialMod.Material | js.Array[typings.three.materialMod.Material]
    ], 
    org.scalablytyped.runtime.Instantiable0[
      typings.three.mod.LineSegments[
        typings.three.geometryMod.Geometry | typings.three.bufferGeometryMod.BufferGeometry, 
        typings.three.materialMod.Material | js.Array[typings.three.materialMod.Material]
      ]
    ]
  ]
  
  type MaterialNode[T /* <: typings.three.mod.Material */, P] = typings.reactThreeFiber.threeTypesMod.Overwrite[
    typings.reactThreeFiber.threeTypesMod.Node[T, P], 
    typings.reactThreeFiber.anon.Color
  ]
  
  type MaterialProps = typings.reactThreeFiber.threeTypesMod.MaterialNode[typings.three.mod.Material, js.Array[typings.three.materialMod.MaterialParameters]]
  
  type Matrix3Props = typings.reactThreeFiber.threeTypesMod.Node[
    typings.three.mod.Matrix3, 
    org.scalablytyped.runtime.Instantiable0[typings.three.mod.Matrix3]
  ]
  
  type Matrix4 = typings.three.mod.Matrix4 | (typings.std.Parameters[
    js.Function16[
      /* n11 */ scala.Double, 
      /* n12 */ scala.Double, 
      /* n13 */ scala.Double, 
      /* n14 */ scala.Double, 
      /* n21 */ scala.Double, 
      /* n22 */ scala.Double, 
      /* n23 */ scala.Double, 
      /* n24 */ scala.Double, 
      /* n31 */ scala.Double, 
      /* n32 */ scala.Double, 
      /* n33 */ scala.Double, 
      /* n34 */ scala.Double, 
      /* n41 */ scala.Double, 
      /* n42 */ scala.Double, 
      /* n43 */ scala.Double, 
      /* n44 */ scala.Double, 
      typings.three.matrix4Mod.Matrix4
    ]
  ])
  
  type Matrix4Props = typings.reactThreeFiber.threeTypesMod.Node[
    typings.three.mod.Matrix4, 
    org.scalablytyped.runtime.Instantiable0[typings.three.mod.Matrix4]
  ]
  
  type MeshBasicMaterialProps = typings.reactThreeFiber.threeTypesMod.MaterialNode[
    typings.three.mod.MeshBasicMaterial, 
    js.Array[typings.three.meshBasicMaterialMod.MeshBasicMaterialParameters]
  ]
  
  type MeshDepthMaterialProps = typings.reactThreeFiber.threeTypesMod.MaterialNode[
    typings.three.mod.MeshDepthMaterial, 
    js.Array[typings.three.meshDepthMaterialMod.MeshDepthMaterialParameters]
  ]
  
  type MeshDistanceMaterialProps = typings.reactThreeFiber.threeTypesMod.MaterialNode[
    typings.three.mod.MeshDistanceMaterial, 
    js.Array[typings.three.meshDistanceMaterialMod.MeshDistanceMaterialParameters]
  ]
  
  type MeshLambertMaterialProps = typings.reactThreeFiber.threeTypesMod.MaterialNode[
    typings.three.mod.MeshLambertMaterial, 
    js.Array[typings.three.meshLambertMaterialMod.MeshLambertMaterialParameters]
  ]
  
  type MeshMatcapMaterialProps = typings.reactThreeFiber.threeTypesMod.MaterialNode[
    typings.three.mod.MeshMatcapMaterial, 
    js.Array[typings.three.meshMatcapMaterialMod.MeshMatcapMaterialParameters]
  ]
  
  type MeshNormalMaterialProps = typings.reactThreeFiber.threeTypesMod.MaterialNode[
    typings.three.mod.MeshNormalMaterial, 
    js.Array[typings.three.meshNormalMaterialMod.MeshNormalMaterialParameters]
  ]
  
  type MeshPhongMaterialProps = typings.reactThreeFiber.threeTypesMod.MaterialNode[
    typings.three.mod.MeshPhongMaterial, 
    js.Array[typings.three.meshPhongMaterialMod.MeshPhongMaterialParameters]
  ]
  
  type MeshPhysicalMaterialProps = typings.reactThreeFiber.threeTypesMod.MaterialNode[
    typings.three.mod.MeshPhysicalMaterial, 
    js.Array[typings.three.meshPhysicalMaterialMod.MeshPhysicalMaterialParameters]
  ]
  
  type MeshProps = typings.reactThreeFiber.threeTypesMod.Object3DNode[
    typings.three.mod.Mesh[
      typings.three.geometryMod.Geometry | typings.three.bufferGeometryMod.BufferGeometry, 
      typings.three.materialMod.Material | js.Array[typings.three.materialMod.Material]
    ], 
    org.scalablytyped.runtime.Instantiable0[
      typings.three.mod.Mesh[
        typings.three.geometryMod.Geometry | typings.three.bufferGeometryMod.BufferGeometry, 
        typings.three.materialMod.Material | js.Array[typings.three.materialMod.Material]
      ]
    ]
  ]
  
  type MeshStandardMaterialProps = typings.reactThreeFiber.threeTypesMod.MaterialNode[
    typings.three.mod.MeshStandardMaterial, 
    js.Array[typings.three.meshStandardMaterialMod.MeshStandardMaterialParameters]
  ]
  
  type MeshToonMaterialProps = typings.reactThreeFiber.threeTypesMod.MaterialNode[
    typings.three.mod.MeshToonMaterial, 
    js.Array[typings.three.meshToonMaterialMod.MeshToonMaterialParameters]
  ]
  
  type NamedArrayTuple[T /* <: js.Function1[/* args */ js.Any, _] */] = typings.std.Parameters[T]
  
  type Node[T, P] = typings.reactThreeFiber.threeTypesMod.Overwrite[typings.std.Partial[T], typings.reactThreeFiber.threeTypesMod.NodeProps[T, P]]
  
  type NonFunctionKeys[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends std.Function? never : K}[keyof T] */ js.Any
  
  type Object3DNode[T, P] = (typings.reactThreeFiber.threeTypesMod.Overwrite[
    typings.reactThreeFiber.threeTypesMod.Node[T, P], 
    typings.reactThreeFiber.anon.Dispose
  ]) with typings.reactThreeFiber.threeTypesMod.EventHandlers
  
  type OctahedronBufferGeometryProps = typings.reactThreeFiber.threeTypesMod.BufferGeometryNode[
    typings.three.mod.OctahedronBufferGeometry, 
    org.scalablytyped.runtime.Instantiable0[typings.three.mod.OctahedronBufferGeometry]
  ]
  
  type OctahedronGeometryProps = typings.reactThreeFiber.threeTypesMod.GeometryNode[
    typings.three.mod.OctahedronGeometry, 
    org.scalablytyped.runtime.Instantiable0[typings.three.mod.OctahedronGeometry]
  ]
  
  type OrthographicCameraProps = typings.reactThreeFiber.threeTypesMod.Object3DNode[
    typings.three.mod.OrthographicCamera, 
    org.scalablytyped.runtime.Instantiable4[
      /* left */ scala.Double, 
      /* right */ scala.Double, 
      /* top */ scala.Double, 
      /* bottom */ scala.Double, 
      typings.three.mod.OrthographicCamera
    ]
  ]
  
  type Overwrite[T, O] = (typings.std.Omit[T, typings.reactThreeFiber.threeTypesMod.NonFunctionKeys[O]]) with O
  
  type ParametricBufferGeometryProps = typings.reactThreeFiber.threeTypesMod.BufferGeometryNode[
    typings.three.mod.ParametricBufferGeometry, 
    org.scalablytyped.runtime.Instantiable3[
      /* func */ js.Function3[
        /* u */ scala.Double, 
        /* v */ scala.Double, 
        /* dest */ typings.three.vector3Mod.Vector3, 
        scala.Unit
      ], 
      /* slices */ scala.Double, 
      /* stacks */ scala.Double, 
      typings.three.mod.ParametricBufferGeometry
    ]
  ]
  
  type ParametricGeometryProps = typings.reactThreeFiber.threeTypesMod.GeometryNode[
    typings.three.mod.ParametricGeometry, 
    org.scalablytyped.runtime.Instantiable3[
      /* func */ js.Function3[
        /* u */ scala.Double, 
        /* v */ scala.Double, 
        /* dest */ typings.three.vector3Mod.Vector3, 
        scala.Unit
      ], 
      /* slices */ scala.Double, 
      /* stacks */ scala.Double, 
      typings.three.mod.ParametricGeometry
    ]
  ]
  
  type PerspectiveCameraProps = typings.reactThreeFiber.threeTypesMod.Object3DNode[
    typings.three.mod.PerspectiveCamera, 
    org.scalablytyped.runtime.Instantiable0[typings.three.mod.PerspectiveCamera]
  ]
  
  type PlaneBufferGeometryProps = typings.reactThreeFiber.threeTypesMod.BufferGeometryNode[
    typings.three.mod.PlaneBufferGeometry, 
    org.scalablytyped.runtime.Instantiable0[typings.three.mod.PlaneBufferGeometry]
  ]
  
  type PlaneGeometryProps = typings.reactThreeFiber.threeTypesMod.GeometryNode[
    typings.three.mod.PlaneGeometry, 
    org.scalablytyped.runtime.Instantiable0[typings.three.mod.PlaneGeometry]
  ]
  
  type PlaneHelperProps = typings.reactThreeFiber.threeTypesMod.Object3DNode[
    typings.three.mod.PlaneHelper, 
    org.scalablytyped.runtime.Instantiable1[/* plane */ typings.three.planeMod.Plane, typings.three.mod.PlaneHelper]
  ]
  
  type PointLightHelperProps = typings.reactThreeFiber.threeTypesMod.Object3DNode[
    typings.three.mod.PointLightHelper, 
    org.scalablytyped.runtime.Instantiable1[
      /* light */ typings.three.pointLightMod.PointLight, 
      typings.three.mod.PointLightHelper
    ]
  ]
  
  type PointLightProps = typings.reactThreeFiber.threeTypesMod.LightNode[
    typings.three.mod.PointLight, 
    org.scalablytyped.runtime.Instantiable0[typings.three.mod.PointLight]
  ]
  
  type PointsMaterialProps = typings.reactThreeFiber.threeTypesMod.MaterialNode[
    typings.three.mod.PointsMaterial, 
    js.Array[typings.three.pointsMaterialMod.PointsMaterialParameters]
  ]
  
  type PointsProps = typings.reactThreeFiber.threeTypesMod.Object3DNode[
    typings.three.mod.Points[
      typings.three.geometryMod.Geometry | typings.three.bufferGeometryMod.BufferGeometry, 
      typings.three.materialMod.Material | js.Array[typings.three.materialMod.Material]
    ], 
    org.scalablytyped.runtime.Instantiable0[
      typings.three.mod.Points[
        typings.three.geometryMod.Geometry | typings.three.bufferGeometryMod.BufferGeometry, 
        typings.three.materialMod.Material | js.Array[typings.three.materialMod.Material]
      ]
    ]
  ]
  
  type PolarGridHelperProps = typings.reactThreeFiber.threeTypesMod.Object3DNode[
    typings.three.mod.PolarGridHelper, 
    org.scalablytyped.runtime.Instantiable4[
      /* radius */ scala.Double, 
      /* radials */ scala.Double, 
      /* circles */ scala.Double, 
      /* divisions */ scala.Double, 
      typings.three.mod.PolarGridHelper
    ]
  ]
  
  type PolyhedronBufferGeometryProps = typings.reactThreeFiber.threeTypesMod.BufferGeometryNode[
    typings.three.mod.PolyhedronBufferGeometry, 
    org.scalablytyped.runtime.Instantiable2[
      /* vertices */ js.Array[scala.Double], 
      /* indices */ js.Array[scala.Double], 
      typings.three.mod.PolyhedronBufferGeometry
    ]
  ]
  
  type PolyhedronGeometryProps = typings.reactThreeFiber.threeTypesMod.GeometryNode[
    typings.three.mod.PolyhedronGeometry, 
    org.scalablytyped.runtime.Instantiable2[
      /* vertices */ js.Array[scala.Double], 
      /* indices */ js.Array[scala.Double], 
      typings.three.mod.PolyhedronGeometry
    ]
  ]
  
  type PositionalAudioProps = typings.reactThreeFiber.threeTypesMod.Object3DNode[
    typings.three.mod.PositionalAudio, 
    org.scalablytyped.runtime.Instantiable1[
      /* listener */ typings.three.audioListenerMod.AudioListener, 
      typings.three.mod.PositionalAudio
    ]
  ]
  
  type Quaternion = typings.three.mod.Quaternion | (typings.std.Parameters[
    js.Function4[
      /* x */ scala.Double, 
      /* y */ scala.Double, 
      /* z */ scala.Double, 
      /* w */ scala.Double, 
      typings.three.quaternionMod.Quaternion
    ]
  ])
  
  type QuaternionProps = typings.reactThreeFiber.threeTypesMod.Node[typings.three.mod.Quaternion, typings.reactThreeFiber.anon.TypeofQuaternion]
  
  type RawShaderMaterialProps = typings.reactThreeFiber.threeTypesMod.MaterialNode[
    typings.three.mod.RawShaderMaterial, 
    js.Array[typings.three.shaderMaterialMod.ShaderMaterialParameters]
  ]
  
  type RaycasterProps = typings.reactThreeFiber.threeTypesMod.Node[
    typings.three.mod.Raycaster, 
    org.scalablytyped.runtime.Instantiable0[typings.three.mod.Raycaster]
  ]
  
  type RectAreaLightProps = typings.reactThreeFiber.threeTypesMod.LightNode[
    typings.three.mod.RectAreaLight, 
    org.scalablytyped.runtime.Instantiable0[typings.three.mod.RectAreaLight]
  ]
  
  type RingBufferGeometryProps = typings.reactThreeFiber.threeTypesMod.BufferGeometryNode[
    typings.three.mod.RingBufferGeometry, 
    org.scalablytyped.runtime.Instantiable6[
      /* innerRadius */ js.UndefOr[scala.Double], 
      /* outerRadius */ js.UndefOr[scala.Double], 
      /* thetaSegments */ js.UndefOr[scala.Double], 
      /* phiSegments */ js.UndefOr[scala.Double], 
      /* thetaStart */ js.UndefOr[scala.Double], 
      /* thetaLength */ js.UndefOr[scala.Double], 
      typings.three.mod.RingBufferGeometry
    ]
  ]
  
  type RingGeometryProps = typings.reactThreeFiber.threeTypesMod.GeometryNode[
    typings.three.mod.RingGeometry, 
    org.scalablytyped.runtime.Instantiable6[
      /* innerRadius */ js.UndefOr[scala.Double], 
      /* outerRadius */ js.UndefOr[scala.Double], 
      /* thetaSegments */ js.UndefOr[scala.Double], 
      /* phiSegments */ js.UndefOr[scala.Double], 
      /* thetaStart */ js.UndefOr[scala.Double], 
      /* thetaLength */ js.UndefOr[scala.Double], 
      typings.three.mod.RingGeometry
    ]
  ]
  
  type SceneProps = typings.reactThreeFiber.threeTypesMod.Object3DNode[
    typings.three.mod.Scene, 
    org.scalablytyped.runtime.Instantiable0[typings.three.mod.Scene]
  ]
  
  type ShaderMaterialProps = typings.reactThreeFiber.threeTypesMod.MaterialNode[
    typings.three.mod.ShaderMaterial, 
    js.Array[typings.three.shaderMaterialMod.ShaderMaterialParameters]
  ]
  
  type ShadowMaterialProps = typings.reactThreeFiber.threeTypesMod.MaterialNode[
    typings.three.mod.ShadowMaterial, 
    js.Array[typings.three.shaderMaterialMod.ShaderMaterialParameters]
  ]
  
  type ShapeBufferGeometryProps = typings.reactThreeFiber.threeTypesMod.BufferGeometryNode[
    typings.three.mod.ShapeBufferGeometry, 
    org.scalablytyped.runtime.Instantiable1[/* shapes */ typings.three.shapeMod.Shape, typings.three.mod.ShapeBufferGeometry]
  ]
  
  type ShapeGeometryProps = typings.reactThreeFiber.threeTypesMod.GeometryNode[
    typings.three.mod.ShapeGeometry, 
    org.scalablytyped.runtime.Instantiable1[/* shapes */ typings.three.shapeMod.Shape, typings.three.mod.ShapeGeometry]
  ]
  
  type SkeletonHelperProps = typings.reactThreeFiber.threeTypesMod.Object3DNode[
    typings.three.mod.SkeletonHelper, 
    org.scalablytyped.runtime.Instantiable1[/* object */ typings.three.object3DMod.Object3D, typings.three.mod.SkeletonHelper]
  ]
  
  type SkeletonProps = typings.reactThreeFiber.threeTypesMod.Object3DNode[
    typings.three.mod.Skeleton, 
    org.scalablytyped.runtime.Instantiable1[/* bones */ js.Array[typings.three.boneMod.Bone], typings.three.mod.Skeleton]
  ]
  
  type SkinnedMeshProps = typings.reactThreeFiber.threeTypesMod.Object3DNode[
    typings.three.mod.SkinnedMesh[
      typings.three.geometryMod.Geometry | typings.three.bufferGeometryMod.BufferGeometry, 
      typings.three.materialMod.Material | js.Array[typings.three.materialMod.Material]
    ], 
    org.scalablytyped.runtime.Instantiable0[
      typings.three.mod.SkinnedMesh[
        typings.three.geometryMod.Geometry | typings.three.bufferGeometryMod.BufferGeometry, 
        typings.three.materialMod.Material | js.Array[typings.three.materialMod.Material]
      ]
    ]
  ]
  
  type SphereBufferGeometryProps = typings.reactThreeFiber.threeTypesMod.BufferGeometryNode[
    typings.three.mod.SphereBufferGeometry, 
    org.scalablytyped.runtime.Instantiable7[
      /* radius */ js.UndefOr[scala.Double], 
      /* widthSegments */ js.UndefOr[scala.Double], 
      /* heightSegments */ js.UndefOr[scala.Double], 
      /* phiStart */ js.UndefOr[scala.Double], 
      /* phiLength */ js.UndefOr[scala.Double], 
      /* thetaStart */ js.UndefOr[scala.Double], 
      /* thetaLength */ js.UndefOr[scala.Double], 
      typings.three.mod.SphereBufferGeometry
    ]
  ]
  
  type SphereGeometryProps = typings.reactThreeFiber.threeTypesMod.GeometryNode[
    typings.three.mod.SphereGeometry, 
    org.scalablytyped.runtime.Instantiable7[
      /* radius */ js.UndefOr[scala.Double], 
      /* widthSegments */ js.UndefOr[scala.Double], 
      /* heightSegments */ js.UndefOr[scala.Double], 
      /* phiStart */ js.UndefOr[scala.Double], 
      /* phiLength */ js.UndefOr[scala.Double], 
      /* thetaStart */ js.UndefOr[scala.Double], 
      /* thetaLength */ js.UndefOr[scala.Double], 
      typings.three.mod.SphereGeometry
    ]
  ]
  
  type SpotLightHelperProps = typings.reactThreeFiber.threeTypesMod.Object3DNode[
    typings.three.mod.SpotLightHelper, 
    org.scalablytyped.runtime.Instantiable1[/* light */ typings.three.lightMod.Light, typings.three.mod.SpotLightHelper]
  ]
  
  type SpotLightProps = typings.reactThreeFiber.threeTypesMod.LightNode[
    typings.three.mod.SpotLight, 
    org.scalablytyped.runtime.Instantiable6[
      /* color */ js.UndefOr[typings.three.colorMod.Color | java.lang.String | scala.Double], 
      /* intensity */ js.UndefOr[scala.Double], 
      /* distance */ js.UndefOr[scala.Double], 
      /* angle */ js.UndefOr[scala.Double], 
      /* penumbra */ js.UndefOr[scala.Double], 
      /* decay */ js.UndefOr[scala.Double], 
      typings.three.mod.SpotLight
    ]
  ]
  
  type SpotLightShadowProps = typings.reactThreeFiber.threeTypesMod.Node[
    typings.three.mod.SpotLightShadow, 
    org.scalablytyped.runtime.Instantiable0[typings.three.mod.SpotLightShadow]
  ]
  
  type SpriteMaterialProps = typings.reactThreeFiber.threeTypesMod.MaterialNode[
    typings.three.mod.SpriteMaterial, 
    js.Array[typings.three.spriteMaterialMod.SpriteMaterialParameters]
  ]
  
  type SpriteProps = typings.reactThreeFiber.threeTypesMod.Object3DNode[
    typings.three.mod.Sprite, 
    org.scalablytyped.runtime.Instantiable0[typings.three.mod.Sprite]
  ]
  
  type TetrahedronBufferGeometryProps = typings.reactThreeFiber.threeTypesMod.BufferGeometryNode[
    typings.three.mod.TetrahedronBufferGeometry, 
    org.scalablytyped.runtime.Instantiable0[typings.three.mod.TetrahedronBufferGeometry]
  ]
  
  type TetrahedronGeometryProps = typings.reactThreeFiber.threeTypesMod.GeometryNode[
    typings.three.mod.TetrahedronGeometry, 
    org.scalablytyped.runtime.Instantiable0[typings.three.mod.TetrahedronGeometry]
  ]
  
  type TextBufferGeometryProps = typings.reactThreeFiber.threeTypesMod.BufferGeometryNode[
    typings.three.mod.TextBufferGeometry, 
    org.scalablytyped.runtime.Instantiable2[
      /* text */ java.lang.String, 
      /* parameters */ typings.three.textBufferGeometryMod.TextGeometryParameters, 
      typings.three.mod.TextBufferGeometry
    ]
  ]
  
  type TextGeometryProps = typings.reactThreeFiber.threeTypesMod.GeometryNode[
    typings.three.mod.TextGeometry, 
    org.scalablytyped.runtime.Instantiable2[
      /* text */ java.lang.String, 
      /* parameters */ typings.three.textBufferGeometryMod.TextGeometryParameters, 
      typings.three.mod.TextGeometry
    ]
  ]
  
  type TextureProps = typings.reactThreeFiber.threeTypesMod.Node[typings.three.mod.Texture, typings.reactThreeFiber.anon.TypeofTexture]
  
  type TorusBufferGeometryProps = typings.reactThreeFiber.threeTypesMod.BufferGeometryNode[
    typings.three.mod.TorusBufferGeometry, 
    org.scalablytyped.runtime.Instantiable0[typings.three.mod.TorusBufferGeometry]
  ]
  
  type TorusGeometryProps = typings.reactThreeFiber.threeTypesMod.GeometryNode[
    typings.three.mod.TorusGeometry, 
    org.scalablytyped.runtime.Instantiable0[typings.three.mod.TorusGeometry]
  ]
  
  type TorusKnotBufferGeometryProps = typings.reactThreeFiber.threeTypesMod.BufferGeometryNode[
    typings.three.mod.TorusKnotBufferGeometry, 
    org.scalablytyped.runtime.Instantiable6[
      /* radius */ js.UndefOr[scala.Double], 
      /* tube */ js.UndefOr[scala.Double], 
      /* tubularSegments */ js.UndefOr[scala.Double], 
      /* radialSegments */ js.UndefOr[scala.Double], 
      /* p */ js.UndefOr[scala.Double], 
      /* q */ js.UndefOr[scala.Double], 
      typings.three.mod.TorusKnotBufferGeometry
    ]
  ]
  
  type TorusKnotGeometryProps = typings.reactThreeFiber.threeTypesMod.GeometryNode[
    typings.three.mod.TorusKnotGeometry, 
    org.scalablytyped.runtime.Instantiable6[
      /* radius */ js.UndefOr[scala.Double], 
      /* tube */ js.UndefOr[scala.Double], 
      /* tubularSegments */ js.UndefOr[scala.Double], 
      /* radialSegments */ js.UndefOr[scala.Double], 
      /* p */ js.UndefOr[scala.Double], 
      /* q */ js.UndefOr[scala.Double], 
      typings.three.mod.TorusKnotGeometry
    ]
  ]
  
  type TubeBufferGeometryProps = typings.reactThreeFiber.threeTypesMod.BufferGeometryNode[
    typings.three.mod.TubeBufferGeometry, 
    org.scalablytyped.runtime.Instantiable1[
      /* path */ typings.three.curveMod.Curve[typings.three.vector3Mod.Vector3], 
      typings.three.mod.TubeBufferGeometry
    ]
  ]
  
  type TubeGeometryProps = typings.reactThreeFiber.threeTypesMod.GeometryNode[
    typings.three.mod.TubeGeometry, 
    org.scalablytyped.runtime.Instantiable1[
      /* path */ typings.three.curveMod.Curve[typings.three.vector3Mod.Vector3], 
      typings.three.mod.TubeGeometry
    ]
  ]
  
  type Vector2 = typings.three.mod.Vector2 | typings.std.Parameters[typings.reactThreeFiber.anon.FnCallXY]
  
  type Vector2Props = typings.reactThreeFiber.threeTypesMod.Node[
    typings.three.mod.Vector2, 
    org.scalablytyped.runtime.Instantiable0[typings.three.mod.Vector2]
  ]
  
  type Vector3 = typings.three.mod.Vector3 | typings.std.Parameters[typings.reactThreeFiber.anon.FnCallXYZ]
  
  type Vector3Props = typings.reactThreeFiber.threeTypesMod.Node[
    typings.three.mod.Vector3, 
    org.scalablytyped.runtime.Instantiable0[typings.three.mod.Vector3]
  ]
  
  type Vector4Props = typings.reactThreeFiber.threeTypesMod.Node[
    typings.three.mod.Vector4, 
    org.scalablytyped.runtime.Instantiable0[typings.three.mod.Vector4]
  ]
  
  type VideoTextureProps = typings.reactThreeFiber.threeTypesMod.Node[
    typings.three.mod.VideoTexture, 
    org.scalablytyped.runtime.Instantiable9[
      /* video */ typings.std.HTMLVideoElement, 
      /* mapping */ js.UndefOr[typings.three.constantsMod.Mapping], 
      /* wrapS */ js.UndefOr[typings.three.constantsMod.Wrapping], 
      /* wrapT */ js.UndefOr[typings.three.constantsMod.Wrapping], 
      /* magFilter */ js.UndefOr[typings.three.constantsMod.TextureFilter], 
      /* minFilter */ js.UndefOr[typings.three.constantsMod.TextureFilter], 
      /* format */ js.UndefOr[typings.three.constantsMod.PixelFormat], 
      /* type */ js.UndefOr[typings.three.constantsMod.TextureDataType], 
      /* anisotropy */ js.UndefOr[scala.Double], 
      typings.three.mod.VideoTexture
    ]
  ]
  
  type WireframeGeometryProps = typings.reactThreeFiber.threeTypesMod.BufferGeometryNode[
    typings.three.mod.WireframeGeometry, 
    org.scalablytyped.runtime.Instantiable1[
      /* geometry */ typings.three.geometryMod.Geometry, 
      typings.three.mod.WireframeGeometry
    ]
  ]
}
