organization := "org.scalablytyped"
name := "sinon-chrome"
version := "v2.2.4-dt-20190322Z-75ad08"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "chrome" % "0.0-unknown-dt-20190520Z-5f50f7",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20190322Z-77f4f8",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20190322Z-2cdd35",
  "org.scalablytyped" %%% "sinon" % "7.0-dt-20190525Z-046356",
  "org.scalablytyped" %%% "std" % "3.5-c5d119")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        