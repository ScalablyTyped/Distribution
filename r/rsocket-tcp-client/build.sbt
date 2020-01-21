organization := "org.scalablytyped"
name := "rsocket-tcp-client"
version := "0.0-dt-20191126Z-be9a3b"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200117Z-4be21b",
  "org.scalablytyped" %%% "rsocket-core" % "0.0-dt-20191126Z-517253",
  "org.scalablytyped" %%% "rsocket-flowable" % "0.0-dt-20191126Z-c54e90",
  "org.scalablytyped" %%% "rsocket-types" % "0.0-dt-20191126Z-f2344c",
  "org.scalablytyped" %%% "std" % "3.7-96076c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        