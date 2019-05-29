organization := "org.scalablytyped"
name := "react-codemirror"
version := "v1.0.0-dt-20190322Z-d8b7d8"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "codemirror" % "0.0-unknown-dt-20190409Z-b9e9cd",
  "org.scalablytyped" %%% "csstype" % "2.6.4-a0e5c1",
  "org.scalablytyped" %%% "estree" % "0.0-unknown-dt-20190322Z-79a60f",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-b94c72",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190528Z-1cea03",
  "org.scalablytyped" %%% "std" % "3.4-ef47bb",
  "org.scalablytyped" %%% "tern" % "0.23-dt-20190516Z-232917")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        